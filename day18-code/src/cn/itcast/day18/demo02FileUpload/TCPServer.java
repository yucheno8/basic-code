package cn.itcast.day18.demo02FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yucheno8
 * @date 2022/2/28/028
 **/

/*
    文件上传案例的服务器端：读取客户端上传的文件，保存到服务器的硬盘，给客户端回写“上传成功”

    明确：
        数据源：客户端上传的文件
        目的地：服务器的硬盘 d:\\upload\\1.jpg

    实现步骤：
        1. 创建一个服务器ServerSocket对象，系统要指定的端口号（使用服务器端获取客户端对象）
        2. 使用ServerSocket对象中的方法accept，获取到请求的客户端Socket对象
        3. 使用Socket对象中的方法getInputStream，获取到网络字节输入流InputStream对象（网络-->服务器端内存：对象创建，用于读取网络文件数据）
        4. 判断d:\\upload文件夹是否存在，不存在则创建
        5. 创建一个本地字节输出流FileOutputStream对象，构造方法中绑定要输出的目的地（服务器端内存-->服务器端硬盘：对象创建，用于读取服务器端文件数据）
        6. 使用网络字节输入流InputStream对象中的方法read，读取客户端上传的文件（网络-->服务器端内存：方法执行，用于读取网络文件数据）
        7. 使用本地字节输出流对象FileOutputStream对象中的方法write，把读取到的文件保存到服务器的硬盘上（服务器端内存-->服务器端硬盘：方法执行，用于读取服务器端文件数据）
        8. 使用Socket对象中的方法getOutputStream，获取到网络字节输出流OutputStream对象（服务器端内存-->网络：对象创建，用于读取回写数据）
        9. 使用网络字节输出流OutputStream对象中的方法write，给客户端回写“上传成功”（服务器端内存-->网络：方法执行，用于读取回写数据）
        10.释放资源（FileOutputStream，Socket，ServerSocket）
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个服务器ServerSocket对象，系统要指定的端口号
        ServerSocket server = new ServerSocket(8888);
        // 2. 使用ServerSocket对象中的方法accept，获取到请求的客户端Socket对象
        Socket socket = server.accept();
        // 3. 使用Socket对象中的方法getInputStream，获取到网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        // 4. 判断d:\\upload文件夹是否存在，不存在则创建
        File file = new File("d:\\upload");
        if (!file.exists()) {
            file.mkdirs();
        }
        // 5. 创建一个本地字节输出流FileOutputStream对象，构造方法中绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream(file + "\\1.jpg");
        // 6. 使用网络字节输出流InputStream对象中的方法read，读取客户端上传的文件

        System.out.println("11111111");

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1) {
            /*
                is.read读取客户端上传的文件，永远也读取不到文件的结束标记
                read方法进入到阻塞状态，一直死循环等待结束标记 8、9、10代码就不会执行到 也不会给客户端回写上传成功
             */
            // 7. 使用本地字节输出流对象FileOutputStream对象中的方法write，把读取到的文件保存到服务器的硬盘上
            fos.write(bytes, 0, len);
        }

        System.out.println("2222222222 while死循环打印不到");

        // 8. 使用Socket对象中的方法getOutputStream，获取到网络字节输出流OutputStream对象
        // 9. 使用网络字节输出流OutputStream对象中的方法write，给客户端回写“上传成功”
        socket.getOutputStream().write("上传成功".getBytes());
        // 10.释放资源（FileOutputStream，Socket，ServerSocket）
        fos.close();
        socket.close();
        server.close();

    }
}
