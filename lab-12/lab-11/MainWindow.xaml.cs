using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
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

namespace lab_11
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

        private void b1(object sender, RoutedEventArgs e)
        {
            Environment.Exit(0);
        }

        private void b4(object sender, RoutedEventArgs e)
        {
            txt.Content = "Panel";
        }

        private void c2c(object sender, RoutedEventArgs e)
        {
            btn1.IsEnabled = false;
        }
        private void c2u(object sender, RoutedEventArgs e)
        {
            btn1.IsEnabled = true;
        }
        private void c3c(object sender, RoutedEventArgs e)
        {
            btn4.IsEnabled = true;
        }
        private void c3u(object sender, RoutedEventArgs e)
        {
            btn4.IsEnabled = false;
        }

        private void r5(object sender, RoutedEventArgs e)
        {
            p1.Background = Brushes.White;
        }
        private void r6(object sender, RoutedEventArgs e)
        {
            p1.Background = Brushes.Red;
        }
        private void r7(object sender, RoutedEventArgs e)
        {
            p1.Background = Brushes.Yellow;
        }
        private void RadioButton_Loaded(object sender, RoutedEventArgs e)
        {
            rb1.IsChecked = true;
            r5(sender, e);
        }
        private void CheckBox_Loaded(object sender, RoutedEventArgs e)
        {
            ch1.IsChecked = true;
            c3c(sender, e);
        }

    }
}
