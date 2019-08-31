- 生成JKS文件
```
keytool -genkeypair -alias mytest -keyalg RSA -keypass mypass -keystore mytest.jks -storepass mypass
```
- 导出公钥
```
keytool -list -rfc --keystore mytest.jks | openssl x509 -inform pem -pubkey
```