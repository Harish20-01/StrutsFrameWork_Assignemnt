# 📝 Struts To-Do Application (CRUD)

A simple **To-Do List web application** built using **Apache Struts 1**, demonstrating basic **CRUD operations (Create, Read, Update, Delete)** with a clean and modern UI.

---

## 🚀 Features

* ➕ Add new tasks
* 📋 View all tasks
* ✏️ Update existing tasks
* ❌ Delete tasks
* 🎨 Simple modern UI using HTML + CSS
* ⚙️ Built using MVC architecture (Struts 1)

---

## 🛠️ Tech Stack

* Java (JDK 8+ recommended)
* Apache Struts 1
* JSP & Servlets
* Apache Tomcat 9
* Maven
* IntelliJ IDEA

---

## 📁 Project Structure

```
src/
 └── main/
     ├── java/com/example/
     │   ├── action/
     │   ├── form/
     │   └── model/
     │
     └── webapp/
         ├── index.jsp
         ├── tasks.jsp
         └── WEB-INF/
             ├── web.xml
             └── struts-config.xml
```

---

## ⚙️ Setup & Run

### 1. Clone the repository

```
git clone https://github.com/Harish20-01/StrutsFrameWork_Assignemnt.git
cd StrutsFrameWork_Assignemnt
```

---

### 2. Build the project

```
mvn clean package
```

👉 This will generate a `.war` file inside:

```
target/
```

---

### 3. Deploy to Tomcat

1. Copy the generated `.war` file
2. Paste it into:

```
apache-tomcat-9/webapps/
```

3. Start Tomcat:

```
startup.bat   (Windows)
```

---

### 4. Access the application

Open your browser:

```
http://localhost:8080/struts1-sample-1.0-SNAPSHOT/
```

or directly:

```
http://localhost:8080/struts1-sample-1.0-SNAPSHOT/viewTasks.do
```

---

## 🧠 How It Works

* **Model** → `TaskStore.java` (stores tasks in memory)
* **View** → JSP pages (`index.jsp`, `tasks.jsp`)
* **Controller** → Struts Actions (`AddTaskAction`, `ViewTaskAction`, etc.)

Flow:

```
JSP → Action → Model → JSP
```

---

## ⚠️ Notes

* This project uses **in-memory storage**, so data will be lost on server restart.
* Designed for learning purposes (Struts 1 is a legacy framework).
* Requires **Tomcat 9** (not compatible with Tomcat 10+ due to `javax.servlet`).

---

## 📌 Future Improvements

* 💾 Add database (MySQL / PostgreSQL)
* 🎨 Improve UI with Bootstrap or React
* 🔄 Convert to Spring Boot (modern alternative)
* 🔐 Add user authentication

---

## 👨‍💻 Author

**Harish**

---

## 📄 License

This project is for educational purposes.

