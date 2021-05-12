// package collection;

import java.util.*;

public class ListExam 
{

	public static void main(String[] args) 
	{
		//List인터페이스는 메모리에 올릴수 없기 때문에 Array List 플러스를 통헤서 메모리를 통해서 올림.
		List<String> rList = new ArrayList<>();
		
		//List 컬랙션 프레임워크에 데이터를 추가함
		rList.add("이협건");
		rList.add("홍길동");
		rList.add("임꺽정");
		rList.add("고길동");
		
		//배열크기 출력
		System.out.println("배열의 크기" + rList.size());
		
		for(int i = 0; i < rList.size(); i++)
		{
			System.out.println("[" + i + "]번째 배열 기억공간 : " + rList.get(i));
		}
	}

}
