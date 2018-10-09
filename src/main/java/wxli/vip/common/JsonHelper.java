package wxli.vip.common;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonHelper
{
    public static Gson gson= new GsonBuilder() .setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    public static<T> String toJson(T instance)
    {
        if(instance==null)
        {
            return "";
        }

        return gson.toJson(instance);
    }

    public static<T>  T toInstance(String json,String className)
    {
        try{
            T instance = (T) gson.fromJson(json,Class.forName(className));
            return instance;
        }
        catch (Exception ex)
        {
            System.out.println("序列化失败");
        }
        return null;
    }


    public  static<T> T toInstance(String json,Class className)
    {
        try{
            T instance = (T) gson.fromJson(json,className);
            return instance;
        }
        catch (Exception ex)
        {
            System.out.println("序列化失败");
        }
        return null;
    }

}
