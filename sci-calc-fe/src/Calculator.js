import React, { useState } from "react";
import "./Calculator.css"; // Import the CSS file

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
        <div className="calculator-container">
            <h1>Scientific Calculator</h1>
            <input
                type="number"
                value={input}
                onChange={(e) => setInput(e.target.value)}
                className="input-field"
                placeholder="Enter number"
            />
            <div className="buttons">
                <button className="calc-button" onClick={() => calculate("sqrt")}>√x</button>
                <button className="calc-button" onClick={() => calculate("fact")}>x!</button>
                <button className="calc-button" onClick={() => calculate("ln")}>ln(x)</button>
                <button className="calc-button" onClick={() => calculate("power")}>xʸ</button>
            </div>
            <h2 className="result">Result: {result}</h2>
        </div>
    );
}

export default Calculator;
