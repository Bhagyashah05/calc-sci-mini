import React, { useState } from "react";

const API_URL = "http://localhost:8090/api";

function Calculator() {
    const [input, setInput] = useState("");
    const [result, setResult] = useState("");

    const calculate = async (operation) => {
        let url = `${API_URL}/${operation}/${input}`;
        if (operation === "power") {
            const exponent = prompt("Enter exponent:");
            url = `${API_URL}/power/${input}/${exponent}`;
        }

        const response = await fetch(url);
        const data = await response.text();
        setResult(data);
    };

    return (
        <div>
            <input
                type="number"
                value={input}
                onChange={(e) => setInput(e.target.value)}
            />
            <button onClick={() => calculate("sqrt")}>√x</button>
            <button onClick={() => calculate("fact")}>x!</button>
            <button onClick={() => calculate("ln")}>ln(x)</button>
            <button onClick={() => calculate("power")}>xʸ</button>
            <h2>Result: {result}</h2>
        </div>
    );
}

export default Calculator;
