package ch10code;

public class Teacher1 implements school, school1{
	private String schoolname;
		private String classname;
		private String teachername;
		private String teachercode;
		private String teachersexy;
		private String teacherbirthday;
		private String familyaddress;
		//通过设置器来设置各个参数
		public void setschoolname(String schoolname) {
			this.schoolname = schoolname;
		}
		public void setclassname(String classname) {
			this.classname = classname;
		}
		public void setname(String teachername) {
			this.teachername = teachername;
		}
		public void setcode(String teachercode) {
			this.teachercode = teachercode;
		}
		public void setsexy(String teachersexy) {
			this.teachersexy = teachersexy;
		}
		public void setbirthday(String teacherbirthday) {
			this.teacherbirthday = teacherbirthday;
		}
		public void setfamilyaddress(String familyaddress) {
			this.familyaddress = familyaddress;
		}
		//通过访问器来获得对象的参数
		public String getschoolname() {
			return schoolname;
		}
		public String getclassname() {
			return classname;
		}
		public String getname() {
			return teachername;
		}
		public String getcode() {
			return teachercode;
		}
		public String getsexy() {
			return teachersexy;
		}
		public String getbirthday() {
			return teacherbirthday;
		}
		public String getfamilyaddress() {
			return familyaddress;
		}
		//通过tostring方法来让对象以字符串形式输出
		public String tostring() {
			String infor = "学校名称：" + schoolname + "  " + "班级名称：" + classname + "  "
					+ "教师姓名：" + teachername + "  " + "教师工号：" + teachercode + "  "
					+ "性别：" + teachersexy + "  " + "出生年月：" + teacherbirthday + "  "
					+ "家庭地址：" + familyaddress;
			return infor;        //返回字符串对象infor
		}

}
