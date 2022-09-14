import org.example.product.pojo.PmsBaseAttrInfo;
import org.example.product.service.impl.PmsBaseAttrInfoServiceImpl;
import org.junit.Test;

import java.util.List;

public class PmsBaseAttrInfoTest {
    PmsBaseAttrInfoServiceImpl impl =new PmsBaseAttrInfoServiceImpl();
    @Test
    public void AttrInfo() {
        List<PmsBaseAttrInfo> list = impl.getPmsBaseAttrInfoByCatalog3Id(61);
        System.out.println(list);
    }
}
