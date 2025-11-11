# Cloud Provider ISP Example

This project demonstrates the **Interface Segregation Principle (ISP)** — one of the SOLID design principles in software construction.

## 📚 Description
A single large interface was split into multiple smaller, specific interfaces:

- `CloudHostingProvider` → manages server operations  
- `CDNProvider` → provides CDN services  
- `CloudStorageProvider` → handles file storage  

## 🧠 Classes Implemented
- **Amazon** implements all three interfaces.  
- **Dropbox** implements only the storage interface.  

## 🧪 How to Run
You can run this project on [Programiz Online Java Compiler](https://www.programiz.com/java-programming/online-compiler):
1. Copy code from each `.java` file.
2. Paste it all into one Programiz file.
3. Click **Run**.

## 🧼 Clean Code Principles
- Interface Segregation (ISP)
- Single Responsibility
- Meaningful naming
- Consistent formatting
