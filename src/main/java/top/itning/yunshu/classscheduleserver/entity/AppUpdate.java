package top.itning.yunshu.classscheduleserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 应用升级实体信息
 *
 * @author itning
 */
@Entity
public class AppUpdate implements Serializable {
    /**
     * 版本号
     */
    @Id
    private int versionCode;
    /**
     * 版本名
     */
    @Column(unique = true, nullable = false)
    private String versionName;
    /**
     * 描述
     */
    @Column(unique = true, nullable = false)
    private String versionDesc;
    /**
     * 下载地址
     */
    @Column(unique = true, nullable = false)
    private String downloadUrl;

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getVersionDesc() {
        return versionDesc;
    }

    public void setVersionDesc(String versionDesc) {
        this.versionDesc = versionDesc;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Override
    public String toString() {
        return "AppUpdate{" +
                "versionCode='" + versionCode + '\'' +
                ", versionName='" + versionName + '\'' +
                ", versionDesc='" + versionDesc + '\'' +
                ", downloadUrl='" + downloadUrl + '\'' +
                '}';
    }
}
