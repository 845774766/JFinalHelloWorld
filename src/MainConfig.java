import com.jfinal.config.*;
import com.jfinal.template.Engine;

public class MainConfig extends JFinalConfig {

//	/**
//	 * main   Tomcat使用时注释，jetty使用时打开
//	 */
//	public static void main(String[] args) {
//		JFinal.start("WebRoot", 81, "/", 5);
////		System.out.println("Hello World!");
//	}
	@Override
	public void configConstant(Constants me) {
		//配置常量
	}
	@Override
	public void configRoute(Routes me) {
		// 添加路由
		me.add("/",IndexController.class);  //添加index界面，路径为 /
	}
	@Override
	public void configEngine(Engine me) {
		// 添加模板文件
	}
	@Override
	public void configPlugin(Plugins me) {
		//配置插件
	}
	@Override
	public void configInterceptor(Interceptors me) {
		//拦截器
	}
	@Override
	public void configHandler(Handlers me) {
		// 添加扩展
	}
}