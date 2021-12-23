package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	
	@RequestMapping("/hello")
	 public testVo hello() {
	  testVo vo = new testVo();
	  vo.setUsrId("123");
	  vo.setUsrNm("KM");
	  vo.setUsrLoclNm("À¯");
	  return vo;
	 }

}
