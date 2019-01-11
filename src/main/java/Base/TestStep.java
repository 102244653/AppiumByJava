package Base;
import lombok.Data;

import java.util.Map;

//测试步骤元素
@Data
public class TestStep extends TestBase{

    /**
     * 当前步骤的行为，调用StepAction中的方法
     **/
    private PageAction action;


    /**
     * Action行为对应的元素定位，包含索引，属性名=属性值[索引]
     * 如果可以确定唯一要获取的元素，则可以省略[索引]
     **/
    private String element;

    /**
     * Action行为对应所需要传递的参数值
     * <h1>value="5000"</h1>
     * <h1>value={"5000","100"}</h1>
     **/
    private String value;

    private String[] values;

    /**
     * Action行为对应的操作备注
     * <h1>desc="输入客户家庭联系人姓名"</h1>
     **/
    private String desc;

    /**
     * 行为的细节描述，其格式与css中的样式格式一致，比如<br/>
     * 在要做滑动操作时，细节描述如下，range代表滑动时间，num代表滑动次数
     * <h1>details="range:500;num:1;"</h1>
     * 具体不同的操作的文档会在项目稳定后整理出来
     **/
    private Map<String,String> details;

    /**
     * 检测结果的预期值
     *<h1>expect="百度"</h1>
     **/
    private String expect;

    /**
     * 失败用例的截图名称
     *<h1>casename="case1"</h1>
     **/
    private String caseid;

    /**
     * 模拟键盘按键操作的键值，单个按键
     * <h1>key="F5"</h1>
     **/
    private String key;

    /**
     * 模拟Windows键盘按键操作的键值，组合按键
     *<h1>key="CONTROL" keys="TAB"</h1>
     **/
    private String keys;

    /**
     * 调用后台接口的URL地址
     *<h1>url="https://travel.api.szjqb.net/api/Web/Order/completes"</h1>
     **/
    private String url;

    /**
     * 调用后台接口所需传递的参数类型名称
     *<h1>body="order_sn"</h1>
     **/
    private String body;

    /**
     * 检测结果不匹配时的提示信息，用于记录到测试报告中
     */
    private String message;
}