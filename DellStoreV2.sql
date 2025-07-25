
create DATABASE DellStore2
USE [DellStore2]
GO
/****** Object:  Table [dbo].[chi_tiet_dot_giam_gia]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chi_tiet_dot_giam_gia](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[chi_tiet_san_pham_id] [int] NULL,
	[dot_giam_gia_id] [int] NULL,
	[muc_giam] [decimal](5, 2) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[chi_tiet_hoa_don]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chi_tiet_hoa_don](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[hoa_don_id] [int] NULL,
	[chi_tiet_san_pham_id] [int] NULL,
	[so_luong] [int] NULL,
	[don_gia] [decimal](18, 2) NULL,
	[trang_thai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[chi_tiet_san_pham]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chi_tiet_san_pham](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[serial_id] [int] NULL,
	[san_pham_id] [int] NULL,
	[cpu_id] [int] NULL,
	[ram_id] [int] NULL,
	[ssd_id] [int] NULL,
	[gpu_id] [int] NULL,
	[gia_ban] [decimal](18, 2) NULL,
	[so_luong_ton] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[chi_tiet_thanh_toan]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chi_tiet_thanh_toan](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[hoa_don_id] [int] NULL,
	[hinh_thuc_thanh_toan_id] [int] NULL,
	[so_tien] [decimal](18, 2) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[cpu]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[cpu](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nvarchar](100) NULL,
	[toc_do] [nvarchar](50) NULL,
	[loai] [nvarchar](50) NULL,
	[trang_thai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[dot_giam_gia]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[dot_giam_gia](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ngay_bat_dau] [date] NULL,
	[ngay_ket_thuc] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[gpu]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[gpu](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nvarchar](100) NULL,
	[loai] [nvarchar](50) NULL,
[trang_thai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[hang]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[hang](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[hinh_thuc_thanh_toan]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[hinh_thuc_thanh_toan](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[hoa_don]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[hoa_don](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ma] [varchar](50) NULL,
	[nhan_vien_id] [int] NULL,
	[khach_hang_id] [int] NULL,
	[ngay_tao] [date] NULL,
	[tong_tien] [decimal](18, 2) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[khach_hang]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[khach_hang](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nvarchar](100) NULL,
	[gioi_tinh] [varchar](15) NULL,
	[dia_chi] [varchar](100) NULL,
	[sdt] [varchar](15) NULL,
	[email] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[loai_san_pham]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[loai_san_pham](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[nhan_vien]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[nhan_vien](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ma_nv] [varchar](20) NULL,
	[ten_nv] [nvarchar](100) NULL,
	[gioi_tinh] [bit] NULL,
	[ngay_sinh] [date] NULL,
	[dia_chi] [nvarchar](255) NULL,
	[sdt] [varchar](15) NULL,
	[email] [varchar](100) NULL,
	[trang_thai] [int] NULL,
	[chuc_vu] [nvarchar](50) NULL,
	[tai_khoan] [varchar](50) NULL,
	[mat_khau] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ram]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ram](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nvarchar](100) NULL,
	[dung_luong] [nvarchar](50) NULL,
	[loai] [nvarchar](50) NULL,
	[trang_thai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[san_pham]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[san_pham](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nvarchar](100) NULL,
	[ma_sp] [varchar](20) NULL,
	[mo_ta] [nvarchar](255) NULL,
	[loai_san_pham_id] [int] NULL,
	[hang_id] [int] NULL,
	[trang_thai] [int] NULL,
	[so_luong] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[serial]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[serial](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ma_serial] [varchar](50) NULL,
	[san_pham_id] [int] NULL,
	[trang_thai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[serial_da_ban]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[serial_da_ban](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[serial_id] [int] NULL,
	[hoa_don_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ssd]    Script Date: 7/21/2025 3:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ssd](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nvarchar](100) NULL,
	[dung_luong] [nvarchar](50) NULL,
	[loai] [nvarchar](50) NULL,
[trang_thai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[chi_tiet_san_pham] ON 
INSERT [dbo].[chi_tiet_san_pham] ([id], [serial_id], [san_pham_id], [cpu_id], [ram_id], [ssd_id], [gpu_id], [gia_ban], [so_luong_ton]) VALUES (1, 1, 8, 1, 1, 1, 1, CAST(15000000.00 AS Decimal(18, 2)), 10)
INSERT [dbo].[chi_tiet_san_pham] ([id], [serial_id], [san_pham_id], [cpu_id], [ram_id], [ssd_id], [gpu_id], [gia_ban], [so_luong_ton]) VALUES (2, 2, 8, 2, 2, 2, 2, CAST(20000000.00 AS Decimal(18, 2)), 20)
INSERT [dbo].[chi_tiet_san_pham] ([id], [serial_id], [san_pham_id], [cpu_id], [ram_id], [ssd_id], [gpu_id], [gia_ban], [so_luong_ton]) VALUES (3, 3, 8, 3, 3, 3, 3, CAST(25000000.00 AS Decimal(18, 2)), 30)
INSERT [dbo].[chi_tiet_san_pham] ([id], [serial_id], [san_pham_id], [cpu_id], [ram_id], [ssd_id], [gpu_id], [gia_ban], [so_luong_ton]) VALUES (4, 4, 8, 4, 4, 4, 4, CAST(30000000.00 AS Decimal(18, 2)), 40)
INSERT [dbo].[chi_tiet_san_pham] ([id], [serial_id], [san_pham_id], [cpu_id], [ram_id], [ssd_id], [gpu_id], [gia_ban], [so_luong_ton]) VALUES (5, 5, 8, 5, 5, 5, 5, CAST(35000000.00 AS Decimal(18, 2)), 50)
INSERT [dbo].[chi_tiet_san_pham] ([id], [serial_id], [san_pham_id], [cpu_id], [ram_id], [ssd_id], [gpu_id], [gia_ban], [so_luong_ton]) VALUES (6, 6, 8, 6, 6, 6, 6, CAST(40000000.00 AS Decimal(18, 2)), 60)
INSERT [dbo].[chi_tiet_san_pham] ([id], [serial_id], [san_pham_id], [cpu_id], [ram_id], [ssd_id], [gpu_id], [gia_ban], [so_luong_ton]) VALUES (7, 7, 8, 7, 7, 7, 7, CAST(45000000.00 AS Decimal(18, 2)), 70)
INSERT [dbo].[chi_tiet_san_pham] ([id], [serial_id], [san_pham_id], [cpu_id], [ram_id], [ssd_id], [gpu_id], [gia_ban], [so_luong_ton]) VALUES (8, 8, 8, 8, 8, 8, NULL, CAST(50000000.00 AS Decimal(18, 2)), 80)
INSERT [dbo].[chi_tiet_san_pham] ([id], [serial_id], [san_pham_id], [cpu_id], [ram_id], [ssd_id], [gpu_id], [gia_ban], [so_luong_ton]) VALUES (9, 9, 8, 9, 9, 9, NULL, CAST(55000000.00 AS Decimal(18, 2)), 90)
INSERT [dbo].[chi_tiet_san_pham] ([id], [serial_id], [san_pham_id], [cpu_id], [ram_id], [ssd_id], [gpu_id], [gia_ban], [so_luong_ton]) VALUES (10, 10, 8, 10, 10, 10, NULL, CAST(60000000.00 AS Decimal(18, 2)), 100)
SET IDENTITY_INSERT [dbo].[chi_tiet_san_pham] OFF
GO
SET IDENTITY_INSERT [dbo].[cpu] ON 
INSERT [dbo].[cpu] ([id], [ten], [toc_do], [loai], [trang_thai]) VALUES (1, N'CPU 1', N'2.0GHz', N'Intel', 1)
INSERT [dbo].[cpu] ([id], [ten], [toc_do], [loai], [trang_thai]) VALUES (2, N'CPU 2', N'4.0GHz', N'Intel', 1)
INSERT [dbo].[cpu] ([id], [ten], [toc_do], [loai], [trang_thai]) VALUES (3, N'CPU 3', N'6.0GHz', N'Intel', 1)
INSERT [dbo].[cpu] ([id], [ten], [toc_do], [loai], [trang_thai]) VALUES (4, N'CPU 4', N'8.0GHz', N'Intel', 1)
INSERT [dbo].[cpu] ([id], [ten], [toc_do], [loai], [trang_thai]) VALUES (5, N'CPU 5', N'10.0GHz', N'Intel', 1)
INSERT [dbo].[cpu] ([id], [ten], [toc_do], [loai], [trang_thai]) VALUES (6, N'CPU 6', N'12.0GHz', N'Intel', 1)
INSERT [dbo].[cpu] ([id], [ten], [toc_do], [loai], [trang_thai]) VALUES (7, N'CPU 7', N'14.0GHz', N'Intel', 1)
INSERT [dbo].[cpu] ([id], [ten], [toc_do], [loai], [trang_thai]) VALUES (8, N'CPU 8', N'16.0GHz', N'Intel', 1)
INSERT [dbo].[cpu] ([id], [ten], [toc_do], [loai], [trang_thai]) VALUES (9, N'CPU 9', N'18.0GHz', N'Intel', 1)
INSERT [dbo].[cpu] ([id], [ten], [toc_do], [loai], [trang_thai]) VALUES (10, N'CPU 10', N'20.0GHz', N'Intel', 1)
SET IDENTITY_INSERT [dbo].[cpu] OFF
GO
SET IDENTITY_INSERT [dbo].[gpu] ON 

INSERT [dbo].[gpu] ([id], [ten], [loai], [trang_thai]) VALUES (1, N'GPU 1', N'NVIDIA', 1)
INSERT [dbo].[gpu] ([id], [ten], [loai], [trang_thai]) VALUES (2, N'GPU 2', N'NVIDIA', 1)
INSERT [dbo].[gpu] ([id], [ten], [loai], [trang_thai]) VALUES (3, N'GPU 3', N'NVIDIA', 1)
INSERT [dbo].[gpu] ([id], [ten], [loai], [trang_thai]) VALUES (4, N'GPU 4', N'NVIDIA', 1)
INSERT [dbo].[gpu] ([id], [ten], [loai], [trang_thai]) VALUES (5, N'GPU 5', N'NVIDIA', 1)
INSERT [dbo].[gpu] ([id], [ten], [loai], [trang_thai]) VALUES (6, N'GPU 6', N'NVIDIA', 1)
INSERT [dbo].[gpu] ([id], [ten], [loai], [trang_thai]) VALUES (7, N'GPU 7', N'NVIDIA', 1)
INSERT [dbo].[gpu] ([id], [ten], [loai], [trang_thai]) VALUES (8, N'GPU 8', N'NVIDIA', 1)
INSERT [dbo].[gpu] ([id], [ten], [loai], [trang_thai]) VALUES (9, N'GPU 9', N'NVIDIA', 1)
INSERT [dbo].[gpu] ([id], [ten], [loai], [trang_thai]) VALUES (10, N'GPU 10', N'NVIDIA', 1)
SET IDENTITY_INSERT [dbo].[gpu] OFF
GO
SET IDENTITY_INSERT [dbo].[hang] ON 

INSERT [dbo].[hang] ([id], [ten]) VALUES (11, N'Dell')
SET IDENTITY_INSERT [dbo].[hang] OFF
GO
SET IDENTITY_INSERT [dbo].[hinh_thuc_thanh_toan] ON 

INSERT [dbo].[hinh_thuc_thanh_toan] ([id], [ten]) VALUES (1, N'Hình thức 1')
INSERT [dbo].[hinh_thuc_thanh_toan] ([id], [ten]) VALUES (2, N'Hình thức 2')
INSERT [dbo].[hinh_thuc_thanh_toan] ([id], [ten]) VALUES (3, N'Hình thức 3')
INSERT [dbo].[hinh_thuc_thanh_toan] ([id], [ten]) VALUES (4, N'Hình thức 4')
INSERT [dbo].[hinh_thuc_thanh_toan] ([id], [ten]) VALUES (5, N'Hình thức 5')
INSERT [dbo].[hinh_thuc_thanh_toan] ([id], [ten]) VALUES (6, N'Hình thức 6')
INSERT [dbo].[hinh_thuc_thanh_toan] ([id], [ten]) VALUES (7, N'Hình thức 7')
INSERT [dbo].[hinh_thuc_thanh_toan] ([id], [ten]) VALUES (8, N'Hình thức 8')
INSERT [dbo].[hinh_thuc_thanh_toan] ([id], [ten]) VALUES (9, N'Hình thức 9')
INSERT [dbo].[hinh_thuc_thanh_toan] ([id], [ten]) VALUES (10, N'Hình thức 10')
SET IDENTITY_INSERT [dbo].[hinh_thuc_thanh_toan] OFF
GO
SET IDENTITY_INSERT [dbo].[khach_hang] ON 

INSERT [dbo].[khach_hang] ([id], [ten], [gioi_tinh], [dia_chi], [sdt], [email]) VALUES (1, N'Khách hàng 1', N'Nam', N'Ð?a ch? KH 1', N'091000001', N'kh1@mail.com')
INSERT [dbo].[khach_hang] ([id], [ten], [gioi_tinh], [dia_chi], [sdt], [email]) VALUES (2, N'Khách hàng 2', N'Nam', N'Ð?a ch? KH 2', N'091000002', N'kh2@mail.com')
INSERT [dbo].[khach_hang] ([id], [ten], [gioi_tinh], [dia_chi], [sdt], [email]) VALUES (3, N'Khách hàng 3', N'Nam', N'Ð?a ch? KH 3', N'091000003', N'kh3@mail.com')
INSERT [dbo].[khach_hang] ([id], [ten], [gioi_tinh], [dia_chi], [sdt], [email]) VALUES (4, N'Khách hàng 4', N'Nam', N'Ð?a ch? KH 4', N'091000004', N'kh4@mail.com')
INSERT [dbo].[khach_hang] ([id], [ten], [gioi_tinh], [dia_chi], [sdt], [email]) VALUES (5, N'Khách hàng 5', N'Nam', N'Ð?a ch? KH 5', N'091000005', N'kh5@mail.com')
INSERT [dbo].[khach_hang] ([id], [ten], [gioi_tinh], [dia_chi], [sdt], [email]) VALUES (6, N'Khách hàng 6', N'Nam', N'Ð?a ch? KH 6', N'091000006', N'kh6@mail.com')
INSERT [dbo].[khach_hang] ([id], [ten], [gioi_tinh], [dia_chi], [sdt], [email]) VALUES (7, N'Khách hàng 7', N'Nam', N'Ð?a ch? KH 7', N'091000007', N'kh7@mail.com')
INSERT [dbo].[khach_hang] ([id], [ten], [gioi_tinh], [dia_chi], [sdt], [email]) VALUES (8, N'Khách hàng 8', N'Nam', N'Ð?a ch? KH 8', N'091000008', N'kh8@mail.com')
INSERT [dbo].[khach_hang] ([id], [ten], [gioi_tinh], [dia_chi], [sdt], [email]) VALUES (9, N'Khách hàng 9', N'Nam', N'Ð?a ch? KH 9', N'091000009', N'kh9@mail.com')
INSERT [dbo].[khach_hang] ([id], [ten], [gioi_tinh], [dia_chi], [sdt], [email]) VALUES (10, N'Khách hàng 10', N'Nam', N'Ð?a ch? KH 10', N'0910000010', N'kh10@mail.com')
SET IDENTITY_INSERT [dbo].[khach_hang] OFF
GO
SET IDENTITY_INSERT [dbo].[loai_san_pham] ON 

INSERT [dbo].[loai_san_pham] ([id], [ten]) VALUES (1, N'Loại SP 1')
INSERT [dbo].[loai_san_pham] ([id], [ten]) VALUES (2, N'Loại SP 2')
INSERT [dbo].[loai_san_pham] ([id], [ten]) VALUES (3, N'Loại SP 3')
INSERT [dbo].[loai_san_pham] ([id], [ten]) VALUES (4, N'Loại SP 4')
INSERT [dbo].[loai_san_pham] ([id], [ten]) VALUES (5, N'Loại SP 5')
INSERT [dbo].[loai_san_pham] ([id], [ten]) VALUES (6, N'Loại SP 6')
INSERT [dbo].[loai_san_pham] ([id], [ten]) VALUES (7, N'Loại SP 7')
INSERT [dbo].[loai_san_pham] ([id], [ten]) VALUES (8, N'Loại SP 8')
INSERT [dbo].[loai_san_pham] ([id], [ten]) VALUES (9, N'Loại SP 9')
INSERT [dbo].[loai_san_pham] ([id], [ten]) VALUES (10, N'Loại SP 10')
SET IDENTITY_INSERT [dbo].[loai_san_pham] OFF
GO
SET IDENTITY_INSERT [dbo].[nhan_vien] ON 

INSERT [dbo].[nhan_vien] ([id], [ma_nv], [ten_nv], [gioi_tinh], [ngay_sinh], [dia_chi], [sdt], [email], [trang_thai], [chuc_vu], [tai_khoan], [mat_khau]) VALUES (26, N'NV0014', N'Nhân viên 9', 1, CAST(N'1990-01-09' AS Date), N'Địa chỉ 9', N'090000009', N'nv9@mail.com', 1, N'Nhân viên', NULL, NULL)
INSERT [dbo].[nhan_vien] ([id], [ma_nv], [ten_nv], [gioi_tinh], [ngay_sinh], [dia_chi], [sdt], [email], [trang_thai], [chuc_vu], [tai_khoan], [mat_khau]) VALUES (27, N'NV001', N'đỗ chí công', 1, CAST(N'2005-12-23' AS Date), N'Hà Nội', N'0963852741', N'hoangphucminh231205@gmai.com', 1, N'Quản lý', NULL, NULL)
INSERT [dbo].[nhan_vien] ([id], [ma_nv], [ten_nv], [gioi_tinh], [ngay_sinh], [dia_chi], [sdt], [email], [trang_thai], [chuc_vu], [tai_khoan], [mat_khau]) VALUES (30, N'NV002', N'đỗ chí công', 1, CAST(N'2005-12-23' AS Date), N'Hà Nội', N'0963852741', N'hoangphucminh231205@gmail.com', 1, N'Quản lý', N'côngdcNV002', N'hatUJ0MS')
INSERT [dbo].[nhan_vien] ([id], [ma_nv], [ten_nv], [gioi_tinh], [ngay_sinh], [dia_chi], [sdt], [email], [trang_thai], [chuc_vu], [tai_khoan], [mat_khau]) VALUES (31, N'NV003', N'đỗ chí công', 1, CAST(N'2005-12-23' AS Date), N'Hà Nội', N'0963852741', N'hoangphucminh231205@gmail.com', 1, N'Quản lý', N'congdcNV003', N'QJOufaG1')
SET IDENTITY_INSERT [dbo].[nhan_vien] OFF
GO
SET IDENTITY_INSERT [dbo].[ram] ON 

INSERT [dbo].[ram] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (1, N'RAM 1', N'4GB', N'DDR4', 1)
INSERT [dbo].[ram] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (2, N'RAM 2', N'8GB', N'DDR4', 1)
INSERT [dbo].[ram] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (3, N'RAM 3', N'12GB', N'DDR4', 1)
INSERT [dbo].[ram] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (4, N'RAM 4', N'16GB', N'DDR4', 1)
INSERT [dbo].[ram] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (5, N'RAM 5', N'20GB', N'DDR4', 1)
INSERT [dbo].[ram] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (6, N'RAM 6', N'24GB', N'DDR4', 1)
INSERT [dbo].[ram] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (7, N'RAM 7', N'28GB', N'DDR4', 1)
INSERT [dbo].[ram] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (8, N'RAM 8', N'32GB', N'DDR4', 1)
INSERT [dbo].[ram] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (9, N'RAM 9', N'36GB', N'DDR4', 1)
INSERT [dbo].[ram] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (10, N'RAM 10', N'40GB', N'DDR4', 1)
SET IDENTITY_INSERT [dbo].[ram] OFF
GO
SET IDENTITY_INSERT [dbo].[san_pham] ON 

INSERT [dbo].[san_pham] ([id], [ten], [ma_sp], [mo_ta], [loai_san_pham_id], [hang_id], [trang_thai], [so_luong]) VALUES (3, N'', N'Dell Voltro 15', N'Laptop xách tay', 1, 11, 1, NULL)
INSERT [dbo].[san_pham] ([id], [ten], [ma_sp], [mo_ta], [loai_san_pham_id], [hang_id], [trang_thai], [so_luong]) VALUES (4, N'Dell Voltro 15', N'MSP001', N'Laptop xách tay', 1, 11, 1, NULL)
INSERT [dbo].[san_pham] ([id], [ten], [ma_sp], [mo_ta], [loai_san_pham_id], [hang_id], [trang_thai], [so_luong]) VALUES (7, N'Dell Vostro 3400', NULL, NULL, 2, 11, 1, 2)
INSERT [dbo].[san_pham] ([id], [ten], [ma_sp], [mo_ta], [loai_san_pham_id], [hang_id], [trang_thai], [so_luong]) VALUES (8, N'Dell Voltro 15', N'MSP001', N'Laptop xách tay', 1, 11, 1, 10)
SET IDENTITY_INSERT [dbo].[san_pham] OFF
GO
SET IDENTITY_INSERT [dbo].[serial] ON 

INSERT [dbo].[serial] ([id], [ma_serial], [san_pham_id], [trang_thai]) VALUES (1, N'DELLVOS001', 8, 1)
INSERT [dbo].[serial] ([id], [ma_serial], [san_pham_id], [trang_thai]) VALUES (2, N'DELLVOS002', 8, 1)
INSERT [dbo].[serial] ([id], [ma_serial], [san_pham_id], [trang_thai]) VALUES (3, N'DELLVOS003', 8, 1)
INSERT [dbo].[serial] ([id], [ma_serial], [san_pham_id], [trang_thai]) VALUES (4, N'DELLVOS004', 8, 1)
INSERT [dbo].[serial] ([id], [ma_serial], [san_pham_id], [trang_thai]) VALUES (5, N'DELLVOS005', 8, 1)
INSERT [dbo].[serial] ([id], [ma_serial], [san_pham_id], [trang_thai]) VALUES (6, N'DELLVOS006', 8, 1)
INSERT [dbo].[serial] ([id], [ma_serial], [san_pham_id], [trang_thai]) VALUES (7, N'DELLVOS007', 8, 1)
INSERT [dbo].[serial] ([id], [ma_serial], [san_pham_id], [trang_thai]) VALUES (8, N'DELLVOS008', 8, 1)
INSERT [dbo].[serial] ([id], [ma_serial], [san_pham_id], [trang_thai]) VALUES (9, N'DELLVOS009', 8, 1)
INSERT [dbo].[serial] ([id], [ma_serial], [san_pham_id], [trang_thai]) VALUES (10, N'DELLVOS0010', 8, 1)
SET IDENTITY_INSERT [dbo].[serial] OFF
GO
SET IDENTITY_INSERT [dbo].[ssd] ON 

INSERT [dbo].[ssd] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (1, N'SSD 1', N'128GB', N'SATA', 1)
INSERT [dbo].[ssd] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (2, N'SSD 2', N'256GB', N'SATA', 1)
INSERT [dbo].[ssd] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (3, N'SSD 3', N'384GB', N'SATA', 1)
INSERT [dbo].[ssd] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (4, N'SSD 4', N'512GB', N'SATA', 1)
INSERT [dbo].[ssd] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (5, N'SSD 5', N'640GB', N'SATA', 1)
INSERT [dbo].[ssd] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (6, N'SSD 6', N'768GB', N'SATA', 1)
INSERT [dbo].[ssd] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (7, N'SSD 7', N'896GB', N'SATA', 1)
INSERT [dbo].[ssd] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (8, N'SSD 8', N'1024GB', N'SATA', 1)
INSERT [dbo].[ssd] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (9, N'SSD 9', N'1152GB', N'SATA', 1)
INSERT [dbo].[ssd] ([id], [ten], [dung_luong], [loai], [trang_thai]) VALUES (10, N'SSD 10', N'1280GB', N'SATA', 1)
SET IDENTITY_INSERT [dbo].[ssd] OFF
GO
/****** Object:  Index [UQ__chi_tiet__E54459490B01FE29]    Script Date: 7/21/2025 3:47:43 PM ******/
ALTER TABLE [dbo].[chi_tiet_san_pham] ADD UNIQUE NONCLUSTERED 
(
	[serial_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[chi_tiet_dot_giam_gia]  WITH CHECK ADD FOREIGN KEY([dot_giam_gia_id])
REFERENCES [dbo].[dot_giam_gia] ([id])
GO
ALTER TABLE [dbo].[chi_tiet_hoa_don]  WITH CHECK ADD FOREIGN KEY([hoa_don_id])
REFERENCES [dbo].[hoa_don] ([id])
GO
ALTER TABLE [dbo].[chi_tiet_san_pham]  WITH CHECK ADD  CONSTRAINT [FK_ctsp_cpu] FOREIGN KEY([cpu_id])
REFERENCES [dbo].[cpu] ([id])
GO
ALTER TABLE [dbo].[chi_tiet_san_pham] CHECK CONSTRAINT [FK_ctsp_cpu]
GO
ALTER TABLE [dbo].[chi_tiet_san_pham]  WITH CHECK ADD  CONSTRAINT [FK_ctsp_gpu] FOREIGN KEY([gpu_id])
REFERENCES [dbo].[gpu] ([id])
GO
ALTER TABLE [dbo].[chi_tiet_san_pham] CHECK CONSTRAINT [FK_ctsp_gpu]
GO
ALTER TABLE [dbo].[chi_tiet_san_pham]  WITH CHECK ADD  CONSTRAINT [FK_ctsp_ram] FOREIGN KEY([ram_id])
REFERENCES [dbo].[ram] ([id])
GO
ALTER TABLE [dbo].[chi_tiet_san_pham] CHECK CONSTRAINT [FK_ctsp_ram]
GO
ALTER TABLE [dbo].[chi_tiet_san_pham]  WITH CHECK ADD  CONSTRAINT [FK_ctsp_sanpham] FOREIGN KEY([san_pham_id])
REFERENCES [dbo].[san_pham] ([id])
GO
ALTER TABLE [dbo].[chi_tiet_san_pham] CHECK CONSTRAINT [FK_ctsp_sanpham]
GO
ALTER TABLE [dbo].[chi_tiet_san_pham]  WITH CHECK ADD  CONSTRAINT [FK_ctsp_serial] FOREIGN KEY([serial_id])
REFERENCES [dbo].[serial] ([id])
GO
ALTER TABLE [dbo].[chi_tiet_san_pham] CHECK CONSTRAINT [FK_ctsp_serial]
GO
ALTER TABLE [dbo].[chi_tiet_san_pham]  WITH CHECK ADD  CONSTRAINT [FK_ctsp_ssd] FOREIGN KEY([ssd_id])
REFERENCES [dbo].[ssd] ([id])
GO
ALTER TABLE [dbo].[chi_tiet_san_pham] CHECK CONSTRAINT [FK_ctsp_ssd]
GO
ALTER TABLE [dbo].[chi_tiet_thanh_toan]  WITH CHECK ADD FOREIGN KEY([hinh_thuc_thanh_toan_id])
REFERENCES [dbo].[hinh_thuc_thanh_toan] ([id])
GO
ALTER TABLE [dbo].[chi_tiet_thanh_toan]  WITH CHECK ADD FOREIGN KEY([hoa_don_id])
REFERENCES [dbo].[hoa_don] ([id])
GO
ALTER TABLE [dbo].[hoa_don]  WITH CHECK ADD FOREIGN KEY([khach_hang_id])
REFERENCES [dbo].[khach_hang] ([id])
GO
ALTER TABLE [dbo].[hoa_don]  WITH CHECK ADD FOREIGN KEY([nhan_vien_id])
REFERENCES [dbo].[nhan_vien] ([id])
GO
ALTER TABLE [dbo].[san_pham]  WITH CHECK ADD FOREIGN KEY([hang_id])
REFERENCES [dbo].[hang] ([id])
GO
ALTER TABLE [dbo].[san_pham]  WITH CHECK ADD FOREIGN KEY([loai_san_pham_id])
REFERENCES [dbo].[loai_san_pham] ([id])
GO
ALTER TABLE [dbo].[serial]  WITH CHECK ADD FOREIGN KEY([san_pham_id])
REFERENCES [dbo].[san_pham] ([id])
GO
ALTER TABLE [dbo].[serial_da_ban]  WITH CHECK ADD FOREIGN KEY([hoa_don_id])
REFERENCES [dbo].[hoa_don] ([id])
GO
USE [master]
GO
ALTER DATABASE [DellStore2] SET  READ_WRITE 
GO

use DellStore2;

select * from chi_tiet_san_pham;
SELECT * from san_pham;
insert into san_pham (ten, ma_sp, mo_ta, loai_san_pham_id, hang_id, trang_thai, so_luong) 
values ('Dell chorme', 'MSP001', 'Laptop xách tay', 1, 11, 1, 10);


