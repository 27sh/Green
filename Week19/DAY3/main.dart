import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text("위젯 실습"),
        ),
        body: Container(
            color: Colors.yellow,
            //width: 200,
            //height: 100,
            child: const Column(children: [
              Text("Container 위젯의 하위 위젯으로 Text 위젯을 사용함"),
              Text("Container 위젯의 하위 위젯으로 Text 위젯을 사용함"),
              Text("Container 위젯의 하위 위젯으로 Text 위젯을 사용함"),
            ])),
      ),
    );
  }
}
