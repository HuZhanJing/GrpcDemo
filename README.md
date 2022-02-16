### GrpcDemo
##### 一、生成代码有两种方式
1. protoc --java_out=./ person.proto
   ```
   --proto_path: 引用的其他文件的完整路径
   --java_out: 选择需要生成的格式，并指定生成到的文件夹
2. 使用maven插件
   ```
   Maven生成对象命令： mvn protobuf:compile
   Maven生成rpc class命令：mvn protobuf:compile-custom

3. 调用过程
	
	

##### 二、代码
1. 调用过程
   ```
   1. client -call method-> 
   2. client interceptor -client completed-> 
   3. server interceptor --> 
   4. server -server next-> 
   5. server interceptor -server completed-> 
   6. client interceptor --> client
2. GRPC VS GroovyCloud

    Requests | First(ms) | Second(ms) | Third(ms) | Fourth(ms) | Fifth(ms)
    :----:|:----:|:----:|:----:|:----:|:----:
    GroovyCloud (1w) | 3436 | 2899 | 3780 | 3050 | 2614
    GRPC (1w) | 5209 | 5563 | 4732 | 5206 | 5073
    GroovyCloud (5w) | 12906 | 13864 | 13585 | 14114 | 13718
    GRPC (5w) | 14124 | 14472 | 15396 | 13943 | 14281
    GroovyCloud (10w) | 25202 | 23541 | 25202 | 25801 | 25824
    GRPC (10w) | 26777 | 23621 | 25232 | 23196 | 22867
3. main.java.helloworld.rpc
   ```
   maven插件生成代码的路径
##### 三、文档
1. 英文文档：https://grpc.io/docs/languages/java/basics/
2. 中文文档（旧）：https://doc.oschina.net/grpc?t=60134