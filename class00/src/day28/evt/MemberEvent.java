package day28.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import day28.controller.Member;
import day28.dao.MemberDao;
import day28.vo.MemberVO;
public class MemberEvent implements ActionListener {
	Member main;
	MemberDao mDao;
	
	public MemberEvent() {	}
	public MemberEvent(Member main) {
		this.main = main;
		mDao = new MemberDao();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		// 버튼의 내용 읽어온다. 내용에 따라 처리를 다르게 해준다.
		if(str.equals("회원리스트")) {
			getList();
		}else if(str.equals("회원가입")) {
			mDao.intList();
		}else if(str.equals("회원조회")) {
			getMemb();
		}else if(str.equals("가입test")) {
			addMemb();
		} else if(str.equals("닫기")) {
			JOptionPane.showMessageDialog(null, "시스템을 종료합니다");
			System.exit(0);
		}
	}
	//회원가입 처리함수
	public void getMemb() {
		ArrayList<MemberVO> list = mDao.getmemb();
		for(int i = 0 ; i <list.size(); i++){
			//mno, id, name, mail, tel, avatar ano, aname, m.gen, joindate
			System.out.println(list.get(i).getMno());
			System.out.println(list.get(i).getId());
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getMail());
			System.out.println(list.get(i).getTel());
			System.out.println(list.get(i).getAno());
			System.out.println(list.get(i).getAname());
			System.out.println(list.get(i).getGen());
			System.out.println(list.get(i).getJoinDate());
		}
	}
	
	//회원 정보 리스트 전담 처리함수
	public void getList() {
		ArrayList<MemberVO> list = mDao.getList();
		System.out.println("############ 회원 정보 리스트 ############");
		System.out.println("*mno | **id** | **name** | ****mail**** |");
		System.out.println("-------------------------------------------");
		for(int i = 0 ; i <list.size(); i++) {
			System.out.print(list.get(i).getMno()+" | " );
			System.out.print(list.get(i).getId()+ " | ");
			System.out.print(list.get(i).getName()+ " | ");
			System.out.print(list.get(i).getMail()+ " | ");
			System.out.println();
		}
	}
	
	// 회원가입 처리함수
		public void addMemb() {
			// 메인폼 감추고
			main.fr.setVisible(false);
			// 조인폼 보이게 하고
			main.join.setVisible(true);
		}

	//조회창 보이게 하는 함수

}
