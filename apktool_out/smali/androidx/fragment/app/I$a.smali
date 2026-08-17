.class final Landroidx/fragment/app/I$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:Landroidx/fragment/app/Fragment;

.field c:Z

.field d:I

.field e:I

.field f:I

.field g:I

.field h:Landroidx/lifecycle/k$b;

.field i:Landroidx/lifecycle/k$b;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(ILandroidx/fragment/app/Fragment;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Landroidx/fragment/app/I$a;->a:I

    .line 4
    iput-object p2, p0, Landroidx/fragment/app/I$a;->b:Landroidx/fragment/app/Fragment;

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Landroidx/fragment/app/I$a;->c:Z

    .line 6
    sget-object p1, Landroidx/lifecycle/k$b;->k:Landroidx/lifecycle/k$b;

    iput-object p1, p0, Landroidx/fragment/app/I$a;->h:Landroidx/lifecycle/k$b;

    .line 7
    iput-object p1, p0, Landroidx/fragment/app/I$a;->i:Landroidx/lifecycle/k$b;

    return-void
.end method

.method constructor <init>(ILandroidx/fragment/app/Fragment;Z)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput p1, p0, Landroidx/fragment/app/I$a;->a:I

    .line 10
    iput-object p2, p0, Landroidx/fragment/app/I$a;->b:Landroidx/fragment/app/Fragment;

    .line 11
    iput-boolean p3, p0, Landroidx/fragment/app/I$a;->c:Z

    .line 12
    sget-object p1, Landroidx/lifecycle/k$b;->k:Landroidx/lifecycle/k$b;

    iput-object p1, p0, Landroidx/fragment/app/I$a;->h:Landroidx/lifecycle/k$b;

    .line 13
    iput-object p1, p0, Landroidx/fragment/app/I$a;->i:Landroidx/lifecycle/k$b;

    return-void
.end method
