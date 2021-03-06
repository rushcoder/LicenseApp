package license.szca.com.licenseapp.view;

/**
 * description
 * Created by JD
 * on 2017/9/12.
 */

public interface IRegistView {
    /**
     * 获取证书失败
     * @param msg
     */
    void getLicenseKeyFailed(String msg);

    /**
     * 获取证书成功
     * @param key
     */
    void getLicenseKeySuccess(String key);

    /**
     * 证书校验成功
     * @param msg
     */
    void checkLicenseKeySuccess(String msg);

    /**
     * 证书校验失败
     * @param msg
     */
    void checkLicenseKeyFailed(String msg);

    /**
     * 加载中
     * @param msg
     */
    void showLoading(String msg);
}
