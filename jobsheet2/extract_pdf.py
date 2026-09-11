import PyPDF2

pdf_file = open(r'd:\KULIAH\SEMESTER 3\PRAK PBO\jobsheet2\id-pertemuan-02-kelas-dan-objek.pdf', 'rb')
read_pdf = PyPDF2.PdfReader(pdf_file)
num_pages = len(read_pdf.pages)
text = ''
for i in range(num_pages):
    page = read_pdf.pages[i]
    text += f"\n--- Page {i+1} ---\n"
    text += page.extract_text()

with open(r'd:\KULIAH\SEMESTER 3\PRAK PBO\jobsheet2\pdf_text.txt', 'w', encoding='utf-8') as f:
    f.write(text)
print("PDF extracted to pdf_text.txt")
