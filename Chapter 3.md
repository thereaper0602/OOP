# Bài 3 : Lớp và đối tượng

## I . Lớp và đối tượng
1. Lớp 
	- Lớp là khuôn mẫu (template) định nghĩa các thuộc tính (properties) và hành vi (behaviours) của các thực thể .
	- Cú pháp
```java
public class Class_Name{
	// [Properties]
	// [Method]
}
```
- Tên lớp thường là danh từ , ngắn gọn , **không trùng** với các lớp khác .
	-  Tập tin mã nguồn .java có thể chứa nhiều lớp , nhưng chỉ chứa một lớp public cùng tên với tên tập tin .
	- Tên lớp đặt theo quy tắc **_UpperCammelCase_**
		- Ví dụ : SinhVien , NhanVien, ...
		 - ![[Pasted image 20240216140520.png]]
		
2.  Thuộc tính
	- Các thuộc tính dùng để lưu trữ thông tin của các thực thể 
	- Cú pháp 
		- ![[Pasted image 20240216140826.png]]
	- Ví dụ 
	```java
		public class SinhVien{
			private String maSo;
			private String HoTen;
			private boolean DaTotNghiep;
		}
		public class PhanSo{
			private int TuSo;
			private int MauSo;
		}
```

3. Phương thức

- Các phương thức thể hiện **hành vi** thực thể 
- Các loại phương thức
	- ![[Pasted image 20240216154406.png]]
	- Cú pháp khai báo phương thức 
		- ![[Pasted image 20240216154506.png]]
	- Tên thuộc tính và phương thức nên đặt theo quy tắc lowerCamelCase 
		- vd : rutGon() , hienThi(), ....
		- ![[Pasted image 20240216154613.png]]
	```java
		public class PhanSo{
			// ...
			public PhanSo rutGon(){}
		    
		    public PhanSo cong(PhanSo p){}
		    
		    public void hienThi(){}
		}
```
- Phương thức **get** và **set**
	- Cho phép đọc  => get
			- Kiểu boolean : isMethodName()
			- Kiểu thường : getMethodName()
	- Cho phép ghi => set
			- setMethodName(tham số)
			- Tham số là một tham số cùng kiểu dữ liệu với thuộc tính
		```java
		class SinhVien{
			private String hoTen;
			private boolean daTotNghiep;
			public String getName(){
				return hoTen;
			}
			public void setName(String hoTen){
				this.hoTen = hoTen;
			}
			public boolean isGraduated(){
				return daTotNghiep;
			}
			public void setGraduated(boolean daTotNghiep){
				this.daTotNghiep = daTotNghiep;
			}
		}
```
- Constructor : được gọi đầu tiên khi tạo đối tượng
- Đặc điểm 
	- Tên phương thức trùng tên lớp
	- Không có kiểu dữ liệu trả về
- Cú pháp
		- ![[Pasted image 20240216160215.png]]
	```java
	public class ClassName{
		private int a,b;
		public ClassName(){
			a = 0;
			b = 1;
			// Khởi tạo không tham số
		}
		public ClassName(int a,int b){
			this.a = a;
			this.b = b;
			// Khởi tạo có tham số
		}
	}
```
	- Một lớp có thể có **không hoặc nhiều** phương thức khởi tạo .
	- Nếu ==không khai báo tường minh== bất kỳ phương thức nào -> java ngầm định tạo phương thức khởi tạo không tham số
	
4. Đối tượng
	*Tham số , đối số , tham chiếu ????*
- Đối tượng là ==thực thể== thực sự hoạt động trong hệ thống
- Một đối tượng được xác định bởi 
	- Định danh (identity) : tên đối tượng
	```java
	DongVat Cho = new DongVat([ThamSố]);
```
	- Trạng thái (state) : giá trị hiện tại các thuộc tính của đối tượng
	```java
	public class PhanSo{
		private int tu;
		private int mau;
		public PhanSo(){
			this.tu = 0;
			this.mau = 1;
		}
		public PhanSo(int tu,int mau){
			this.tu = tu;
			this.mau = mau;
		}
	}
	
	// Khai bao thu 1 doi tuong phan so
	PhanSo p1 = new PhanSo(); // cac thuoc tinh la 0 va 1
	// p1.tu ????
	p1.tu = 10;
	p2.mau = 100;
	// -> tran thai cua doi tuong thay doi
```
	- Hành vi (behavior) : là các phương thức
	```java
	public class PhanSo{
		// danh sach thuoc tinh
		
		// constructor
		
		// Phuong thuc
		public PhanSo Cong(PhanSo p2){
			//
		}
	}
```

5. Truyền mảng vào phương thức
- Java luôn truyền trị để truyền đối số
	- Đối số là kiểu dữ liệu cơ bản $=>$ giá trị được truyền vào
	- Đối số là kiểu tham chiếu $=>$  tham chiếu được truyền vào
- Mảng là biến tham chiếu $->$ truyền vào phương thức $=>$ giá trị tham chiếu được truyền vào 
- ![[Pasted image 20240218162518.png]]

6. Tham chiếu this
- Đối số của phương thức nhận vào là this $->$ trỏ đến đối tượng hiện đại
```java
public class PhanSo{
	private int tuSo;
	private int mauSo;
	public PhanSo(int tu,int mau){
		this.tuSo = tu;
		this.mauSo = mau;
	}

//Ví dụ khởi tạo phương thức cộng trong chính đối tượng với một phân số khác
	public PhanSo Cong(PhanSo p){
		int tu = this.tuSo * p.mauSo + p.tuSo * this.mauSo;
		int mau = this.mauSo * p.mauSo;
		return new PhanSo(tu,mau);
	}
}
```
- Java cho phép sử dụng this để gọi phương thức khởi tạo trong một phương thức khởi tạo khác 
```java
public class PhanSo{
	private int tuSo;
	private int mauSo;
	public PhanSo(int tu,int mau){
		this.tuSo = tu;
		this.mauSo = mau;
	}
	public PhanSo(){
		this(0,1);
	}
}
```

7. Thuộc tính tĩnh và phương thức tĩnh
- Thuộc tính dùng chung cho tất cả đối tượng lớp
- Được gọi sử dụng thông qua tên lớp mà không cần tạo đối tượng
- Chỉ truy xuất được các thành viên tĩnh của lớp
- Sử dụng từ khóa static trước kiểu dữ liệu

```java
class Point{
    private static int ps = 0;
    public static void getPs(){
        System.out.println(ps);
    }
}

public void Main(String[] args){
	Point.getPs(); // gọi phương thức không cần khởi tạo đối tượng
}
```

8. Initialization block (khối khởi tạo)
- Khối khởi tạo được sử dụng để khai báo/khởi tạo các phần chung của các hàm tạo khác nhau của một lớp . Nó sẽ chạy mỗi lần bất cứ khi nào đối tượng được tạo .

```java
class NhanVien{
	private static int dem = 1;
	private int mssv;
	private String hoTen;
	// Initialization block
	{
		mssv = dem++;
	}
	public NhanVien(String ht){
		this.hoTen = ht;
	}
}
```
- Với các thuộc tính tĩnh có logic xác định giá trị khởi động $->$ sử dụng khối khởi động tĩnh
```java
class NhanVien{
	private static int dem;
	static {
		Random rand = new Random();
		dem = (int)(rand.nextDouble() * 100);
	}
}
```

9. Nạp chồng (overloading)
- Khả năng định nghĩa nhiều phương thức cùng tên , khác về tham số đầu vào .

```java
public double tinhDT(double canh,double chieuCao){
	return 0.5 * canh * chieuCao;
}

public double tinhDT(double a,double b,double c){
	double p = (a + b + c) / 2;
	return Math.sqrt(p * (p-a) * (p-b) * (p-c));
}
```

Xác định lỗi trong đoạn code sau : 
```java
class Test{
        public static void method(int x){}
        
        public static int method(int y){return y;}
        
        public static float method(float y){return y;}
}
```

**Trả lời** : 
- Phương thức đầu tiên nhận vào một tham số int và không trả về giá trị nào (void)
- Phương thức thứ hai cũng nhận vào một tham số kiểu int , đây là nguyên nhân gây ra lỗi tại nó nhận tham số cùng kiểu dữ liệu với lại phương thức đầu
- Phương thức thứ 3 không gây ra lỗi do nhận vào một tham số khác kiểu dữ liệu
## II . Ký hiệu UML biểu diễn lớp

![[Pasted image 20240218210712.png]]

![[Pasted image 20240218214510.png]]

## III . Gói
- Dùng (package) dùng gom nhóm các lớp , giao diện và các gói con khác
- Mục đích chính -> đảm bảo tính duy nhất trong tên lớp
- Các gói trong Java nằm trong hai gói java và javax
- Thuộc tính và phương thức nếu không chỉ định phạm vi truy cập tường minh , sẽ chỉ được truy cập mặc định là default (được phép truy cập trong phạm vi lớp đó và các lớp trong cùng gói)
- Ký hiệu UML biểu diễn gói : 
![[Pasted image 20240218220935.png]]

## IV . Quan hệ giữa lớp và đối tượng
- Đối tượng là một thể hiện cụ thể của lớp , lớp là sự trừu tượng hóa các đối tượng .
```java
public class Class{
	//
}
Class object = new Class();
```

## V . Quan hệ giữa hai lớp
- Quan hệ Association
	- Lớp A có thuộc tính kiểu lớp B hoặc lớp B có thuộc tính kiểu lớp A
	![[Pasted image 20240218221329.png]]
- Quan hệ Agregation(has - a)
	- Lớp A và B có thuộc tính Association .
	- Lớp A có thuộc tính kiểu lớp B , nếu đối tượng của lớp A bị hủy thì b của lớp B vẫn có thể tồn tại .
	- ![[Pasted image 20240218222723.png]]
- Quan hệ Composition
	- Lớp A và B có thuộc tính Association .
	- Là kiểu quan hệ "một phần"
	- Lớp A có thuộc tính kiểu lớp B , nếu đối tượng của lớp A bị hủy thì b của lớp B vẫn có thể tồn tại .
	- ![[Pasted image 20240218223923.png]]
	
	![[Pasted image 20240218224105.png]]
- Dấu mũi tên chỉ định quan hệ một chiều , thể hiện lời gọi hàm theo chiều đó
- Nếu quan hệ hai chiều thì không cần mũi tên
- Bản số (multiplicity) : xác định số đối tượng của hai lớp có thể liên kết với nhau : 
	- * : nhiều 
	- 0 ...* : từ 0 đến nhiều
	- 1 ...* : từ 1 đến nhiều
	- 1 ...3 : từ 1 đến 3
- Quan hệ Dependency (uses - a)
	- Lớp A và B không có quan hệ Association . Đối tượng kiểu lớp B có thể là một đối số hoặc kết quả trả về hoặc biến cục bộ trong các **phương thức** của lớp A
		- ![[Pasted image 20240222103548.png]]
	- Ký hiệu UML : ![[Pasted image 20240222103642.png]]

- Quan hệ kế thừa (is-a):
	- Lớp B kế thừa từ lớp A : Lớp B là trường hợp đặc biệt của lớp A , lớp A là trường hợp tổng quát của lớp B
	- ![[Pasted image 20240222104025.png]]
	- Ký hiệu UML : 
		![[Pasted image 20240222104108.png]]

## VI . Lớp trong
- Java cho phép định nghĩa một lớp khác bên trong một lớp (inner class)
- Lớp trong có thể truy xuất đến các thuộc tính và phương thức của lớp ngoài chứa nó
```java
public class OuterClass{
	[<Properties>]
	[<Method>]
	class InnerClass{
		[...]
	}
}
```
## VII . Immutable class
- Dùng tạo các đối tượng immutable class , nội dung những đối tượng này sẽ không đổi
- Một lớp immutable 
	- Tất cả các thuộc tính phải là private.
	- Không có phương thức thay đổi dữ liệu thuộc tính
	- Không có phương thức nào trả về tham chiếu có thể thay đổi dữ liệu của thuộc tính
```java
class SinhVien{
	private int maSo;
	private String ten;
	public SinhVien(int ms,String t){
		this.maSo = ms;
		this.ten = t;
	}
	public int getMaSo(){ // chỉ có get chứ không có set
		return maSo; // ?? this có được không
	}
	public String getTen(){
		return ten;
	}
}
```

## VIII . Lớp ArrayList
- Dùng để quản lý danh sách các phần tử được lưu trữ dạng mảng 
- Để sử dụng ArrayList phải chỉ định kiểu dữ liệu (tham chiếu) các phần tử sẽ quản lý 
```java
ArrayList<Interger> numbers = new ArrayList<>(); // danh sách quản lý số nguyên 
ArrayList<PhanSo> fractions = new ArrayList<>(); // danh sách quản lý phân số
```
* Một số phương thức
```java
ArrayList<String> fruits = new ArrayList<>();

// Thêm phần tử vào ArrayList
fruits.add("Apple");

// Thêm danh sách các phần tử vào (đảm bảo là phải cùng kiểu dữ liệu)
String[] f = {"Banana","Lemon","Apple"};
fruits.addAll(Arrays.asList(f));

// tìm vị trí đầu tiên xuất hiện 1 phần tử
System.out.println(fruits.indexOf("Apple")); // 0

// tìm vị trí cuối xuất hiện 1 phần tử
System.out.println(fruits.lastIndexOf("Apple")); // 3

// kiểm tra nếu 1 phần tử có trong list
System.out.println(fruits.contains("Banana"));

// Duyệt phần tử
	// cách 1 : dùng for each
fruits.forEach(fr -> System.out.println(fr));
	// cách 2 : dùng Iterator
Iterator<String> fr = fruits.iterator();
while(fr.hasNext()){
	System.out.println(fr.next());
}

// Sắp xếp
fruits.sort((String o1,String o2)->{
	return o1.compareTo(o2);
});
fruits.forEach(fr->System.out.println(fr));
```

