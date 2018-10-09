package wxli.vip.model;

import lombok.Data;

import java.io.Serializable;
@Data
public class JsonResult implements Serializable {
    private Integer status;
    private String msg;
    private Object data;
    public static JsonResult build(Integer status,String msg,Object data){
        return new JsonResult(status,msg,data);
    }
    public static JsonResult ok(Object data){ return new JsonResult(200,"ok",data); }
    public static JsonResult ok(){ return JsonResult.ok(null); }
    public static JsonResult errMsg(String msg){ return new JsonResult(500,msg,null); }
    public static JsonResult errMap(Object data){ return new JsonResult(501,"error",data); }
    public static JsonResult errTokenMsg(String msg){ return new JsonResult(502,msg,null); }
    public static JsonResult errException(String msg){ return new JsonResult(555,msg,null); }
    public JsonResult() { }

    public JsonResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
}
