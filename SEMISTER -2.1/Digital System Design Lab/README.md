
<h1>DEGITAL SYSTEM DESIGN :Experiment List RU cse-29</h1>
# CREATE BY SUJAN PRODHAN RU.CSE-29
    <table>
        <tr>
            <th>Experiment Number</th>
            <th>Experiment Name</th>
            <th>Description</th>
        </tr>
        <tr>
            <td>1</td>
            <td>BCD to Excess-3 Code Converter</td>
            <td>Design and implement a BCD to Excess-3 code converter that converts Binary Coded Decimal (BCD) numbers to Excess-3 code.</td>
        </tr>
        <tr>
            <td>2</td>
            <td>Excess-3 to BCD Code Converter</td>
            <td>Design and implement an Excess-3 to BCD code converter that converts Excess-3 code numbers to Binary Coded Decimal (BCD) format.</td>
        </tr>
        <tr>
            <td>3</td>
            <td>Gray to Binary and Binary to Gray Code Converter</td>
            <td>Design and implement converters to convert between Gray code and Binary code, both in directions: Gray to Binary and Binary to Gray.</td>
        </tr>
        <tr>
            <td>4</td>
            <td>4-bit Adder/Subtractor</td>
            <td>Design and implement a 4-bit adder/subtractor circuit that can perform both addition and subtraction of 4-bit binary numbers.</td>
        </tr>
        <tr>
            <td>5</td>
            <td>4-bit BCD Adder/Subtractor</td>
            <td>Design and implement a 4-bit BCD adder/subtractor circuit that can perform addition and subtraction of 4-bit BCD numbers.</td>
        </tr>
        <tr>
            <td>6</td>
            <td>MOD-10 Counter - Asynchronous</td>
            <td>Design and verify a MOD-10 counter circuit. Study and implement the behavior of a counter that counts from 0 to 9 in cyclic sequence.</td>
        </tr>
        <tr>
            <td>7</td>
            <td>Asynchronous Counter - Sequential</td>
            <td>Design and implement an asynchronous counter circuit. Study and implement a counter that counts in sequential order using asynchronous logic.</td>
        </tr>
        <tr>
            <td>8</td>
            <td>Synchronous Up-Down Counter</td>
            <td>Design and implement a synchronous up-down counter circuit. Study and implement a counter that can count both upwards and downwards based on control.</td>
        </tr>
    </table>

# এখানে তোমাদের সুবিধার জন্য প্রত্যেকটি এক্সপেরিমেন্টের ভেরিল্গ কোড অ্যাড করা হয়েছে। -সুজন প্রধান(RU-CSE-29)
<h2>Verilog Experiment List</h2>

<table>
    <tr>
        <th>Experiment Number</th>
        <th>Experiment Name</th>
        <th>Verilog Code Link</th>
    </tr>
    <tr>
        <td>1</td>
        <td>BCD to Excess-3 Code Converter</td>
        <td><a href="https://github.com/prodhan2/DSD_verilog/blob/main/BCD%20to%20EXcess3.v">Link</a></td>
    </tr>
    <tr>
        <td>2</td>
        <td>Excess-3 to BCD Code Converter</td>
        <td><a href="https://github.com/prodhan2/DSD_verilog/blob/main/BCD%20to%20EXcess3.v">Link</a></td>
    </tr>
    <tr>
        <td>3</td>
        <td>Gray to Binary and Binary to Gray Converter</td>
        <td><a href="https://github.com/prodhan2/DSD_verilog/blob/main/Binary_to_gray.v">Link</a></td>
    </tr>
    <tr>
        <td>4</td>
        <td>4-bit Adder/Subtractor</td>
        <td><a href="https://github.com/prodhan2/DSD_verilog/blob/main/4%20bit%20adder%20subtractor.v">Link</a></td>
    </tr>
    <tr>
        <td>5</td>
        <td>4-bit BCD Adder</td>
        <td><a href="https://github.com/prodhan2/DSD_verilog/blob/main/BCD%20adder.v">Link</a></td>
    </tr>
    <tr>
        <td>6</td>
        <td>MOD-10 Counter - Asynchronous</td>
        <td><a href="https://github.com/prodhan2/DSD_verilog/blob/main/Mod%2010%20counter%20.v">Link</a></td>
    </tr>
    <tr>
        <td>7</td>
        <td> Sequential counter </td>
        <td><a href="https://github.com/prodhan2/DSD_verilog/blob/main/4%20bit%20sequential%20%20up%20down%20%20counter%20.v">Link</a></td>
    </tr>
    <tr>
        <td>8</td>
        <td>Synchronous Up-Down Counter</td>
        <td><a href="https://github.com/prodhan2/DSD_verilog/blob/main/3Bit%20synchornous%20up%20down%20counter.v">Link</a></td>
    </tr>
</table>

# যদি অরো কোডের  প্রয়োজন হয়ে থাকে তবে  <a href="https://github.com/prodhan2/DSD_verilog">এখানে ক্লিক</a> করতে পারো। 
<h2> কিভাবে ল্যাবের এক্সপেরিমেন্ট গুলো রান করবে তার নিয়ম।::কাউন্টার নিয়মাবলী</h2>

<table>
    <tr>
        <th>কাউন্টার প্রকার</th>
        <th>নির্দেশনা</th>
        <th>মোড ব্যাখ্যা</th>
    </tr>
    <tr>
        <td>এসিঙ্ক্রোনাস কাউন্টার</td>
        <td>
            ১. `clk` ইনপুট দিন।<br>
            ২. `clr` ইনপুট সেট করুন, প্রথমে ০ দিন।<br>
            ৩. ফোর্স মোড ছেড়ে দিন  এবং নন-ফোর্স ক্লক প্রযোগ করুন।
        </td>
        <td>প্রযোজ্য নয়</td>
    </tr>
    <tr>
        <td>সিঙ্ক্রোনাস কাউন্টার</td>
        <td>
            ১. `clk` ইনপুট দিন।<br>
            ২. `clr` ইনপুট সেট করুন, প্রথমে ০ দিন।<br>
            ৩. প্রাথমিক মান 0 দিয়ে চালান, তারপর 1 ব্যবহার করুন।
        </td>
        <td>মোড সেট করুন: 0 বা 1</td>
    </tr>
    <tr>
        <td>সিকোয়েন্সিয়াল কাউন্টার</td>
        <td>
            ১. `clk` ইনপুট দিন।<br>
            ২. `clr` ইনপুট সেট করুন, প্রথমে ০ দিন।<br>
            ৩. প্রাথমিক মান 0 দিয়ে চালান, তারপর 1 ব্যবহার করুন।
        </td>
        <td>প্রযোজ্য নয়</td>
    </tr>
</table>

```
# verilog কোড লিখার নিয়ম

Verilog একটি হার্ডওয়্যার ডেসক্রিপশন ভাষা, যেটি ডিজিটাল লজিক সার্কিট ডিজাইন করার জন্য ব্যবহার হয়। Verilog কোড লেখার জন্য নিম্নলিখিত নিয়মগুলি অনুসরণ করা উচিত:
মডিউল ডেক্লারেশন: কোডের শুরুতে মডিউল ডেক্লারেশন থাকা উচিত। এটি মডিউলের নাম এবং পোর্টফোলিও ডিফাইন করে।
পোর্টফোলিও ডেক্লারেশন: মডিউলের ইনপুট এবং আউটপুট পোর্টফোলিও ডিফাইন করা উচিত।
ইনপুট ও আউটপুট ডেক্লারেশন: প্রতিটি পোর্টফোলিওর জন্য ইনপুট বা আউটপুট ডেক্লারেশন করতে হবে।
ইনপুট, আউটপুট, বা ইনটারনাল ওয়ায়ার ডেক্লারেশন: ডেটা স্ট্রাকচার ডিফাইন করার জন্য ডেটা টাইপ বা ওয়ায়ার ডেক্লারেশন করতে হবে।
কম্বিনেশনাল লজিক ব্লক: কম্বিনেশনাল লজিক সার্কিট ডিজাইন করার জন্য "always" ব্লক ব্যবহার করা হয়।
সিকুয়েন্সিয়াল লজিক ব্লক: সিকুয়েন্সিয়াল লজিক সার্কিট ডিজাইন করার জন্য "always" ব্লক ব্যবহার করতে হবে এবং ক্লক এবং স্টেট ভ্যারিয়েবল ব্যবহার করতে হবে।
কমেন্ট: কোডে মন্তব্য লিখতে কমেন্ট ব্যবহার করা যেতে পারে।
উপরের নির্দিষ্ট নিয়মগুলি অনুসরণ করে Verilog কোড লেখা যায়। আপনি যদি Verilog স্ট্রাকচার এবং কোডিং প্র্যাক্টিস জানতে চান, তাহলে অনলাইন টিউটোরিয়াল বা বই থেকে সাহায্য নেতে পারেন।  ```


