import React,{useState} from 'react';

const Name = () => {
    const [resutl , setResult ] = useState("초기값")
    const viewResult = (e)=>{
        setResult(e.target.value)
    }
    return(
        <div>
            <p>{result}</p>
            <input onChange={viewResult}/>
        </div>
  );
};

export default Name;