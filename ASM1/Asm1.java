package ASM1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//
public class Asm1 {
	static Scanner scan = new Scanner(System.in);
	//Khai báo biến class

	public static void main(String[] args) {

		System.out.println("+-----------+-------------------+---------+");
		System.out.println("| NGÂN HÀNG SỐ | FX29055@v1.0.0           |");
		System.out.println("+-----------+-------------------+---------+");
		System.out.println("|  1. Nhập CCCD                           |");
		System.out.println("|  0.Thoát                                |");
		System.out.println("+-----------+-------------------+---------+");
		System.out.println("Nhập 1 để khai báo CCCD hoặc 0 để thoát!!!");
		System.out.println("Chức năng: ");

		while (true) {

			int num;
			try {
				num = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Chọn chức năng 0 hoac 1");
				menu();
				scan.next();
				// scan.next() được dùng để đọc và bỏ qua giá trị không phù hợp
				continue;

			}
			// điều kiện để chạy vòng lặp
			if (num == 1) {

				while (true) {
					// chạy vòng lặp cho menu chọn easy hoặc hard
					System.out.println("Nhập Easy hoặc Hard để tiếp tục");
					String confirmString = scan.next();
					if (confirmString.toLowerCase().equals("easy")) {
						// equals() để so sánh 2 String với nhau; == dùng so sánh cho số không so sánh
						// được nội dung chuỗi

						while (true) {
							// vòng lặp cho mã số xác nhận
							int random = (int) (Math.random() * 900 + 100);
							// tạo random 1 chuỗi số có 3 chữ số
							System.out.println("Nhập mã xác thực: " + random);
							try {
								// bắt lỗi nhập nếu nhập vào chữ cái. Nếu ko có lỗi thực thi khối lệnh
								int confirmNumber = scan.nextInt();
								if (confirmNumber == random) {
									System.out.println("Nhập số CCCD: ");
									break;
									// break vòng lặp mã xác nhận

								}
							} catch (Exception e) {
								// thực thi nếu try có lỗi
								System.out.println("Mã xác thực không đúng. Vui lòng nhập lại mã xác thực");
								scan.next();
								continue;

							}
						}
						break;
					} else if (confirmString.toLowerCase().equals("hard")) {

						while (true) {
							//// vòng lặp cho mã số xác nhận
							String rdNum = randomAlphaNumeric(6);
							System.out.println("Vui lòng nhập mã xác thực: " + rdNum);
							String confirmNumber = scan.next();
							if (confirmNumber.equals(rdNum)) {
								System.out.println("Nhập số CCCD: ");
								break;
								// break vòng lặp mã xác nhận
							}

						}
						break;
					}

				}
			} else if (num == 0) {
				exit();
				break;
			} else {
				System.out.println("Chọn lại chức năng 0 hoac 1");
				menu();
				continue;
			}
			break;
		}

		String CCCD = scan.next();
		boolean showMenu = false;
		checkcccD(CCCD);
		while (true) {
			if (checkcccD(CCCD) == true) {
//		menu1();
				break;
			} else {
				System.out.println("So CCCD khong hop le.\nVui long nhap lai hoac ‘No’ de thoat");
				CCCD = scan.next();
				if (CCCD.toLowerCase().equals("no")) {
					exit();
					break;
				}
			}

		}

		functionCCCD(CCCD);

	}

	public static void functionCCCD(String CCCD) {

		while (true) {
//		numOfFunction=-1;
			int numOfFunction;
			menu1();
			try {
				numOfFunction = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Kiểm tra chức năng bạn muốn nhập");
				scan.next();
				continue;

			}

			if (numOfFunction == 1) {
				String chooseNumber = CCCD.substring(0, 3);

				switch (chooseNumber) {
				case "001":
					System.out.println("Nơi sinh: Hà Nội");
					break;
				case "002":
					System.out.println("Nơi sinh: Hà Giang");
					break;
				case "004":
					System.out.println("Nơi sinh: Cao bằng");
					break;
				case "006":
					System.out.println("Nơi sinh: Bắc Cạn");
					break;
				case "008":
					System.out.println("Nơi sinh: Tuyên Quang ");
					break;
				case "010":
					System.out.println("Nơi sinh: Lào Cai ");
					break;
				case "011":
					System.out.println("Nơi sinh: Điện Biên ");
					break;
				case "012":
					System.out.println("Nơi sinh: Lai Châu");
					break;
				case "014":
					System.out.println("Nơi sinh: Sơn La ");
					break;
				case "015":
					System.out.println("Nơi sinh: Yên Bái");
					break;
				case "017":
					System.out.println("Nơi sinh: Hòa Bình");
					break;
				case "019":
					System.out.println("Nơi sinh: Thái Nguyên");
					break;
				case "020":
					System.out.println("Nơi sinh: Lạng Sơn");
					break;
				case "022":
					System.out.println("Nơi sinh: Quảng Ninh");
					break;
				case "024":
					System.out.println("Nơi sinh: Bắc Giang");
					break;
				case "025":
					System.out.println("Nơi sinh: Phú Thọ");
					break;
				case "026":
					System.out.println("Nơi sinh: Vĩnh Phúc");
					break;
				case "027":
					System.out.println("Nơi sinh: Bắc Ninh");
					break;
				case "030":
					System.out.println("Nơi sinh: Hải Dương");
					break;
				case "031":
					System.out.println("Nơi sinh: Hải Phòng");
					break;
				case "033":
					System.out.println("Nơi sinh: Hưng Yên");
					break;
				case "034":
					System.out.println("Nơi sinh: Thái Bình");
					break;
				case "035":
					System.out.println("Nơi sinh: Hà Nam");
					break;
				case "036":
					System.out.println("Nơi sinh: Nam Định");
					break;
				case "037":
					System.out.println("Nơi sinh: Ninh Bình");
					break;
				case "038":
					System.out.println("Nơi sinh: Thanh Hóa");
					break;
				case "040":
					System.out.println("Nơi sinh: Nghệ An");
					break;
				case "042":
					System.out.println("Nơi sinh: Hà Tĩnh");
					break;
				case "044":
					System.out.println("Nơi sinh: Quảng Bình");
					break;
				case "045":
					System.out.println("Nơi sinh: Quảng Trị");
					break;
				case "046":
					System.out.println("Nơi sinh: Thừa Thiên Huế");
					break;
				case "048":
					System.out.println("Nơi sinh: Đà Nẵng");
					break;
				case "049":
					System.out.println("Nơi sinh: Quảng Nam");
					break;
				case "051":
					System.out.println("Nơi sinh: Quảng Ngãi");
					break;
				case "052":
					System.out.println("Nơi sinh: Bình Định");
					break;
				case "054":
					System.out.println("Nơi sinh: Phú Yên");
					break;
				case "056":
					System.out.println("Nơi sinh: Khánh Hòa");
					break;
				case "058":
					System.out.println("Nơi sinh: Ninh Thuận");
					break;
				case "060":
					System.out.println("Nơi sinh: Bình Thuận");
					break;
				case "062":
					System.out.println("Nơi sinh: Kon Tum");
					break;
				case "064":
					System.out.println("Nơi sinh: Gia Lai");
					break;
				case "066":
					System.out.println("Nơi sinh: Đắk Lắk");
					break;
				case "067":
					System.out.println("Nơi sinh: Đắk Nông");
					break;
				case "068":
					System.out.println("Nơi sinh: Lâm Đồng");
					break;
				case "070":
					System.out.println("Nơi sinh: Bình Phước");
					break;
				case "072":
					System.out.println("Nơi sinh: Tây Ninh");
					break;
				case "074":
					System.out.println("Nơi sinh: Bình Dương");
					break;
				case "075":
					System.out.println("Nơi sinh: Đồng Nai");
					break;
				case "077":
					System.out.println("Nơi sinh: Bà Rịa Vũng Tàu");
					break;
				case "079":
					System.out.println("Nơi sinh: Hồ Chí Minh");
					break;
				case "080":
					System.out.println("Nơi sinh: Long An");
					break;
				case "082":
					System.out.println("Nơi sinh: Tiền Giang");
					break;
				case "083":
					System.out.println("Nơi sinh: Bến Tre");
					break;
				case "084":
					System.out.println("Nơi sinh: Trà Vinh");
					break;
				case "086":
					System.out.println("Nơi sinh: Vĩnh Long");
					break;
				case "087":
					System.out.println("Nơi sinh: Đồng Tháp");
					break;
				case "089":
					System.out.println("Nơi sinh: An Giang");
					break;
				case "091":
					System.out.println("Nơi sinh: Kiêiang");
					break;
				case "092":
					System.out.println("Nơi sinh: Cần Thơ");
					break;
				case "093":
					System.out.println("Nơi sinh: Hậu Giang");
					break;
				case "094":
					System.out.println("Nơi sinh: Sóc Trăng");
					break;
				case "095":
					System.out.println("Nơi sinh: Bạc Liêu");
					break;
				case "096":
					System.out.println("Nơi sinh: Cà Mau");
					break;
				default:
					System.out.println("CCCD bạn nhập không có trong trong cơ sở dữ liệu. Vui lòng kiểm tra lại");
				}

			} else if (numOfFunction == 2) {
				String gender = CCCD.substring(3, 4);
				String age = CCCD.substring(4, 6);

				switch (gender) {
				case "0":
					System.out.println("Giới tính: Nam  |" + "  Năm sinh: 19" + age);
					break;

				case "1":
					System.out.println("Giới tính: Nữ  |" + "  Năm sinh: 19" + age);
					break;

				case "2":
					System.out.println("Giới tính: Nam  |" + "  Năm sinh: 20" + age);
					break;

				case "3":
					System.out.println("Giới tính: Nữ  |" + "  Năm sinh: 20" + age);
					break;
				case "4":
					System.out.println("Giới tính: Nam  |" + "  Năm sinh: 21" + age);
					break;
				case "5":
					System.out.println("Giới tính: Nữ  |" + "  Năm sinh: 21" + age);
					break;
				case "6":
					System.out.println("Giới tính: Nam  |" + "  Năm sinh: 22" + age);
					break;
				case "7":
					System.out.println("Giới tính: Nữ  |" + "  Năm sinh: 22" + age);
					break;
				case "8":
					System.out.println("Giới tính: Nam  |" + "  Năm sinh: 23" + age);
					break;
				case "9":
					System.out.println("Giới tính: Nữ  |" + "  Năm sinh: 23" + age);
					break;
				default:
					System.out.println("null");

				}

			} else if (numOfFunction == 3) {
				String randomNumberCCCD = CCCD.substring(6, 12);
				System.out.println("6 số cuối căn cước công dân của bạn là " + randomNumberCCCD);

			} else if (numOfFunction == 0) {
				exit();
				break;
			}

		}

	}

	public static boolean checkcccD(String CCCD) {
		boolean showMenu = false;
		while (true) {
			int i = 0;
			if (CCCD.length() != 12)
			// Kiểm tra CCCD có đúng 12 kí tự ko
			{
				showMenu = false;
			} else {
				try {
					// bắt lỗi nhập CCCD. Nếu đúng tiếp tục thực thi khối try
					Long.parseLong(CCCD);
					showMenu = true;

				} catch (NumberFormatException e) {
					// thực thi khi nhập CCCD sai
					showMenu = false;
				}
			}

			return showMenu;
		}
	}

	public static String randomAlphaNumeric(int numberOfCharactor) {
		String ALPHA = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String alpha = "qwertyuiopasdfghjklzxcvbnm";
		String number = "0123456789";
		String ALPHA_NUMERIC = alpha + ALPHA + number;
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numberOfCharactor; i++) {
			int numRan = random.nextInt(ALPHA_NUMERIC.length() - 1);
			char ch = ALPHA_NUMERIC.charAt(numRan);
			sb.append(ch);
		}
		return sb.toString();
	}

	public static void exit() {
		System.exit(0);
	}

	public static void menu() {
		System.out.println("===========================");
		System.out.println("1. Nhập CCCD    ");
		System.out.println("0.Thoát         ");
		System.out.println("===========================");
	}

	public static void menu1() {
		System.out.println("====================================");
		System.out.println("1. Kiểm tra nơi sinh");
		System.out.println("2. Kiểm tra năm sinh, giới tính");
		System.out.println("3. Kiểm tra số ngẫu nhiên");
		System.out.println("0. Thoát");
		System.out.println("====================================");
	}
}
