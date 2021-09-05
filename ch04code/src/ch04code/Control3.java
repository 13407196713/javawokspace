package ch04code;

public class Control3 {
	public static void main(String[] args) {   
		int Chinese = 90;
		int English = 75;
		int Math = 90;
		int Art = 85;
		double Avg = (Chinese + English + Math + Art) / 4;
		if ((Avg > 90) && (Avg <= 100)) {
				System.out.println("这个学生的所有功课的平均分是：" + Avg);
			System.out.println("这个学生的成绩应得A，是优秀");
		} else if ((Avg > 80) && (Avg <= 90)) {
			System.out.println("这个学生的所有功课的平均分是：" + Avg);
			System.out.println("这个学生的成绩应得B，是良好");
		} else if ((Avg > 70) && (Avg <= 80)) {

			System.out.println("这个学生的所有功课的平均分是：" + Avg);
			System.out.println("这个学生的成绩应得C，是良");
		} else if ((Avg > 60) && (Avg <= 70)) {
			System.out.println("这个学生的所有功课的平均分是：" + Avg);
			System.out.println("这个学生的成绩应得D，是合格");
		} else {
			System.out.println("这个学生的所有功课的平均分是：" + Avg);
			System.out.println("这个学生的成绩应得E，是不合格");
		}
	}

}
