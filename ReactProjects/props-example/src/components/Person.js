function Person(props)
{
    const pName = props.name;
    return (
        <div>
            <h1>Hi {pName}</h1>
        </div>
    );
}
export default Person;