import MyComponent from "./MyComponent";

function ExpenseItem() {
    return (
        <div>
            <div>March 28th 2021</div>
            <div>
                <h2>Car Insurance</h2>
                <div>$294.67</div>
            </div>
            <MyComponent></MyComponent>
        </div>
    );
}

export default ExpenseItem;