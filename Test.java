import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;
public class Test {

	public static void main(String[] args) {
		System.out.println("hi1");
		try {
			Hashtable<String, String> env = new Hashtable<String, String>();
			env.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
			env.put("java.naming.provider.url", "dns://");
			DirContext ctx = new InitialDirContext(env);
			System.out.println("hi2 " + ctx);
		} catch (Exception e) {
			System.err.print(e);
		}
	}
}
