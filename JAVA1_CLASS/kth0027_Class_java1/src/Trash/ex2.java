package Trash;

import java.util.Scanner;

class  ex2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		String title[] = {"이름", "국어", "영어", "수학", "총점", "평균", "석차"};

		//학생수
		System.out.print("학생수 = ");
		int studentCnt = scan.nextInt();
		
		//학생 이름을 저장할 배열
		String name[] = new String[studentCnt];
		//점수 저장할 배열
		int jumsu[][] = new int[studentCnt+2][6];

		//이름, 국어, 영어, 수학 점수 입력받아 배열에 저장
		for(int i=0; i<studentCnt; i++){	//학생수 만큼 반복
			System.out.print("이름 = ");
			name[i] = scan.next();
			//점수입력
			for(int j=0; j<3; j++){
				System.out.print(title[j+1]+" = ");
				jumsu[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<studentCnt; i++){	//학생수
			for(int j=0; j<=2; j++){	//과목수
				jumsu[i][3]	+= jumsu[i][j];	//개인별 총점
				jumsu[studentCnt][j]+= jumsu[i][j];	//과목별 총점
			}
			//개인별 평균
			jumsu[i][4]= jumsu[i][3] / 3;
		}

//		//과목별 평균
//		for(int i=0; i<=2; i++){
//			jumsu[studentCnt+1][i] = jumsu[studentCnt][i] / studentCnt;
//		}

		//석차 구하기
		for(int i=0; i<studentCnt; i++){
			int rank = 0;
			for(int j=0; j<=studentCnt; j++){
				if(jumsu[i][4] < jumsu[j][4]){
					rank++;
				}
			}
			jumsu[i][5] = ++rank;
		}

		//석차순으로 정렬
		for(int i=0; i<studentCnt-1; i++){	//학생수 -1만큼
			for(int j=0; j<studentCnt-1; j++){
				if(jumsu[j][5] > jumsu[j+1][5]){	//데이터 교환
					//이름 교환
					String nametemp = name[j];
					name[j] = name[j+1];
					name[j+1] = nametemp;

					//점수 교환
					for(int c=0; c<jumsu[j].length; c++){
						int jumsutemp = jumsu[j][c];
						jumsu[j][c] = jumsu[j+1][c];
						jumsu[j+1][c] = jumsutemp;
					}
				}
			}
		}

		//출력
		System.out.println("==============================================================");
		
		//타이틀 출력
		for(int t=0; t<title.length; t++){
			System.out.print(title[t]+"\t");
		}
		System.out.println();

		//점수 출력
		for(int row=0; row<jumsu.length-2; row++){	//행
			System.out.print(name[row]+"\t");
			for(int col=0; col<jumsu[row].length; col++){	//열
				System.out.print(jumsu[row][col]+"\t");
			}
			System.out.println();
		}

//		//과목별 총점, 평균 출력
//		int kk = 4; 
//		for(int i=studentCnt; i<=studentCnt+1; i++){
//			System.out.print(title[kk++]+"\t");	//제목
//			for(int j=0; j<=2; j++){
//				System.out.print(jumsu[i][j]+"\t");
//			}
//			System.out.println();
//		}
	}
}

