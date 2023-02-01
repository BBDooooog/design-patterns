import java.util.Map;

public abstract class AbstractTemplate {

    private String config;
    private Map<String, Object> cache;

    public String process(String request) {
        //参数校验
        if (!checkParams(request)) {
            return "check fail";
        }
        //构建上下文
        //这里假设是引用传递类型
        String context = "";
        buildContext(context, config);
        before(context);
        //获取算法结果
        get(context);
        //算法后处理
        after(context);
        //结果处理
        return result(context);
    }

    public boolean checkParams(String request) {
        return true;
    }

    public void buildContext(String context, String config) {

    }

    protected void before(String context) {

    }

    protected void after(String context) {

    }

    protected void get(String context) {
        //是否走缓存体系
        boolean cached = true;
        if (cached) {
            cache(context);
        } else {
            context.concat((String) transfer(context));
        }
    }

    protected void cache(String context) {
        //

        Object result = cache.get(context);
        if (result == null) {
            result = transfer(context);
            cache.put(context, result);
        }
        //结果放回context
        context.concat((String) result);
    }

    protected Object transfer(String context) {
        return new Object();
    }

    protected String result(String context) {
        return context;
    }
}
