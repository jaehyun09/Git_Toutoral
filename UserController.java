@controller
아ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ
아ㅏㅏㅏㅏㅏㅏㅏㅏㅏ
아ㅏㅏㅏㅏㅏㅏㅏㅏ
아ㅏㅏㅏㅏㅏㅏㅏ
아ㅏㅏㅏㅏㅏㅏ
아ㅏㅏㅏㅏㅏ
아ㅏㅏㅏㅏ
아ㅏㅏㅏ
아ㅏㅏ
아ㅏ
ㅏ
public class UserController {
	@RequestMapping("/user/login.do")
	public String login() {
		logger.info("login => login");
	return "user/login";
	
}