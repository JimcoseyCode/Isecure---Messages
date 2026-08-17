.class LX3/i;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lg4/a;

.field private final c:Lg4/a;


# direct methods
.method constructor <init>(Landroid/content/Context;Lg4/a;Lg4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LX3/i;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, LX3/i;->b:Lg4/a;

    .line 7
    .line 8
    iput-object p3, p0, LX3/i;->c:Lg4/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)LX3/h;
    .locals 3

    .line 1
    iget-object v0, p0, LX3/i;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LX3/i;->b:Lg4/a;

    .line 4
    .line 5
    iget-object v2, p0, LX3/i;->c:Lg4/a;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, LX3/h;->a(Landroid/content/Context;Lg4/a;Lg4/a;Ljava/lang/String;)LX3/h;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
