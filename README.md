# SimpleHttpServer (Java)

A minimal HTTP server built using Java's built-in `com.sun.net.httpserver` package.
This simple server listens on **port 8080** and returns a plain text message for any request.

---

## 🚀 Features

* Lightweight and dependency-free
* Uses Java’s built-in `HttpServer`
* Responds to all requests on `/`
* Great for beginners learning server-side Java

---

## 📦 Requirements

* **Java 8+**
* A terminal or Java-compatible IDE

---

## 🛠️ How to Run

### 1. Clone the repository

```sh
git clone https://github.com/Kushagra-Sr44/SimpleHttpServer.git
cd SimpleHttpServer
```

### 2. Compile the program

```sh
javac SimpleHttpServer.java
```

### 3. Run the server

```sh
java SimpleHttpServer
```

### 4. Open in browser

Visit:

```
http://localhost:8080
```

You should see:

```
Simple http server
```

---

## 📁 Project Structure

```
SimpleHttpServer/
│
├── SimpleHttpServer.java
└── README.md
```

---

## 🧩 How It Works

### Create the server:

```java
HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
```

### Register the handler:

```java
server.createContext("/", new MyHandler());
```

### Send a response:

```java
exchange.sendResponseHeaders(200, response.length());
os.write(response.getBytes());
```

---

## 📝 Possible Improvements

* Add routing for multiple endpoints
* Return JSON responses
* Add logging
* Add executor for multithreading
* Improve error handling

---
