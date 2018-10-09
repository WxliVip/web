package wxli.vip.model;

import lombok.Data;
import wxli.vip.entity.User;
@Data
public class UserDTO extends User {
    private String mobile;
    private String unionId;
    private String wsOpenId;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getWsOpenId() {
        return wsOpenId;
    }

    public void setWsOpenId(String wsOpenId) {
        this.wsOpenId = wsOpenId;
    }
}
