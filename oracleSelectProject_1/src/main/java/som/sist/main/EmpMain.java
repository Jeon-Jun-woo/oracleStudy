package som.sist.main;
import com.sist.dao.*;
import java.util.*;
public class EmpMain {
	public static void main(String[] args) {
		EmpDAO dao=new EmpDAO();
		//dao.empListData();
		//dao.empCommListDate();
		//Scanner scan=new Scanner(System.in);
		//System.out.print("검색어 입력:");
		//String ename=scan.next();
		//dao.empFindData(ename.toUpperCase());
		//dao.empRpadData();
		//dao.empSalInfoDate();
		//dao.empGroupByData();
		//dao.subqueryNotData();
		dao.subqueryData();
	}
}
