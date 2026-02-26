# Run Python

## Create venv
Windows
```
py -m venv .venv
.\.venv\Scripts\activate
pip install -r requirements.txt
```
Linux
```
python3 -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
```

## Activate venv
Windows
```
.\.venv\Scripts\activate
```
Linux
```
source .venv/bin/activate
```


## Create Requirements.txt
```
pip freeze > requirements.txt
```