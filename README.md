# KiemTra120p

Java console application for managing electricity invoices for Vietnamese and foreign customers. The project appears to be a class exercise focused on inheritance, lists, console input, and basic reporting.

## Features

- Add invoices for Vietnamese customers.
- Add invoices for foreign customers.
- Print invoice lists.
- Calculate total quantity by customer type.
- Calculate average payment amount for foreign customers.
- Filter invoices from September 2013.

## Tech Stack

- Java
- Console input with `Scanner`
- Object-oriented classes

## Project Structure

```text
src/Main.java                 Menu and program flow
src/KhachHang.java            Base customer class
src/KhachHangViet.java        Vietnamese customer invoice class
src/KhachHangNuocNgoai.java   Foreign customer invoice class
```

## Run

Compile:

```bash
javac src/*.java
```

Run:

```bash
java -cp src Main
```

## Menu

```text
1. Nhap danh sach hoa don khach hang
2. Xuat danh sach hoa don khach hang
3. Tinh tong so luong cho tung loai khach hang
4. Tinh trung binh thanh tien cua khach hang nuoc ngoai
5. Xuat hoa don trong thang 09/2013
0. Thoat
```

## Notes

- Consider separating input/output logic from calculation logic.
- Add sample input/output for easier testing.
- Review Vietnamese text for typos before submitting.

