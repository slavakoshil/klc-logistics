import React from "react";

function App() {
  return (
    <div style={{ fontFamily: "Arial" }}>
      <header
        style={{
          backgroundColor: "#0057B8",
          color: "white",
          padding: "20px",
          textAlign: "center",
        }}
      >
        <h1>KLC Logistics</h1>
        <p>Вантажні перевезення по Україні та Європі</p>
      </header>

      <main style={{ padding: "30px", textAlign: "center" }}>
        <h2>Надійні логістичні рішення</h2>

        <p>
          Ми здійснюємо міжнародні та внутрішні перевезення,
          допомагаємо знайти транспорт та супроводжуємо вантажі.
        </p>

        <button
          style={{
            backgroundColor: "#FFD700",
            border: "none",
            padding: "15px 30px",
            fontSize: "18px",
            borderRadius: "10px",
            cursor: "pointer",
          }}
        >
          Залишити заявку
        </button>
      </main>
    </div>
  );
}

export default App;
