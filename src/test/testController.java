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
	  vo.setUsrLoclNm("KM");
	  vo.getUsrId();
	  vo.getUsrLoclNm();
	  vo.getUsrLoclNm();
	  vo.getUsrLoclNm();
	  vo.getUsrNm();
	  vo.getUsrId();
	  vo.getUsrNm();
	  vo.setUsrId("234");
	  return vo;
	 }

}
