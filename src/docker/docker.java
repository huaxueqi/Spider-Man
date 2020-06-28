package docker;

import com.sun.deploy.net.proxy.*;

import java.net.URL;

public class docker implements ProxyHandler {
    int a(int b) {
        return b;
    }

    @Override
    public boolean isSupported(int i) {
        return false;
    }

    @Override
    public boolean isProxyCacheSupported() {
        return false;
    }

    @Override
    public void init(BrowserProxyInfo browserProxyInfo) throws ProxyConfigException {

    }

    @Override
    public ProxyInfo[] getProxyInfo(URL url) throws ProxyUnavailableException {
        return new ProxyInfo[0];
    }
}
