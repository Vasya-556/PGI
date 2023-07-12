using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Threading;

namespace lab_8
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            panel = new StackPanel();
            panel.Margin = new Thickness(57, 100, 0, 0);
            panel.Width = 200;
            panel.Height = 200;
            MainGrid.Children.Add(panel);

            DispatcherTimer timer = new DispatcherTimer();
            timer.Interval = TimeSpan.FromSeconds(1);
            timer.Tick += Timer_Tick;
            timer.Start();
        }

        private void Timer_Tick(object sender, EventArgs e)
        {
            DispatcherTimer timer = (DispatcherTimer)sender;
            timer.Stop();

            button2 = new Button();
            button2.Content = "Button2";
            button2.Margin = new Thickness(-150, 50, 0, 0);
            button2.Width = 100;
            button2.Height = 30;
            button2.Click += Button2_Click;
            panel.Children.Add(button2);
        }


        private void Button2_Click(object sender, RoutedEventArgs e)
        {
            Environment.Exit(0);
        }
    }
}
