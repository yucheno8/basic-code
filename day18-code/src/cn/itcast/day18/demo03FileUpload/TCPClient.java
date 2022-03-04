package cn.itcast.day18.demo03FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author yucheno8
 * @date 2022/2/28/028
 **/

/*
    文件上传案例的客户端：上传到服务器，读取服务器回写的数据
    明确：读取本地文件
        数据源：c:\\1.jpg
        目的地：服务器

    实现步骤：
        1. 创建一个本地的字节输入流FileInputStream对象，构造方法中绑定要读取的数据源（硬盘-->客户端内存：创建对象，用于读取文件数据）
        2. 创建一个客户端Socket对象，构造方法中绑定服务器的iP地址和端口号
        3. 使用Socket中的方法getOutputStream，获取网络字节输出流对象OutputStream对象（客户端内存-->网络：创建对象，用于读取文件数据）
        4. 使用本地的字节输入流对象FileInputStream对象中的方法read，读取本地文件（硬盘-->客户端内存：方法执行，用于读取文件数据）
        5. 使用网络字节输出流OutputStream对象中的方法write，把读取到的文件上传到服务器（客户端内存-->网络：方法执行，用于读取文件数据）
        6. 使用Socket中的方法getInputStream，获取网络字节输入流InputStream对象（网络-->客户端内存：对象创建，用于读取服务器端回写数据）
        7. 使用网络字节输入流InputStream对象中的方法read方法读取服务回写的数据（网络-->客户端内存：方法执行，用于读取服务器端回写数据）
        8. 释放资源（FileInputStream，Socket）
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个本地的字节输入流FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("c:\\1.jpg");
        // 2. 创建一个客户端Socket对象，构造方法中绑定服务器的iP地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);
        // 3. 使用Socket中的方法getOutputStream，获取网络字节输出流对象OutputStream对象
        OutputStream os = socket.getOutputStream();
        // 4. 使用本地的字节输入流对象FileInputStream对象中的方法read，读取本地文件
        int  len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            /*
                fis.read(bytes)读取本地文件，结束标记是读取到-1结束
                while循环里会读取-1吗？不会 那么也不会把结束标记写给服务器
            */
            // 5. 使用网络字节输出流OutputStream对象中的方法write，把读取到的文件上传到服务器
            os.write(bytes, 0, len);
        }

        /*
            解决服务不能停止的方案：上传完文件，给服务器写一个结束标记
            void shutdownOutput() 禁用此套接字的输出流。
            对于 TCP 套接字，任何以前写入的数据都将被发送，并且后跟 TCP 的正常连接终止序列。
         */
        socket.shutdownOutput();

        // 6. 使用Socket中的方法getInputStream，获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();

        // 7. 使用网络字节输入流InputStream对象中的方法read方法读取服务回写的数据
        while ((len = is.read(bytes)) != -1) { // is.read读取不带服务器回写的数据，进入阻塞状态
            System.out.println(new String(bytes, 0, len));
        }

        // 8. 释放资源（FileInputStream，Socket）
        fis.close();
        socket.close();

    }
}
