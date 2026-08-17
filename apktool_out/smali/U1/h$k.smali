.class LU1/h$k;
.super LU1/h$j;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "k"
.end annotation


# instance fields
.field b:F

.field final synthetic c:LU1/h;


# direct methods
.method private constructor <init>(LU1/h;)V
    .locals 1

    .line 1
    iput-object p1, p0, LU1/h$k;->c:LU1/h;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LU1/h$j;-><init>(LU1/h;LU1/h$a;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, LU1/h$k;->b:F

    return-void
.end method

.method synthetic constructor <init>(LU1/h;LU1/h$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LU1/h$k;-><init>(LU1/h;)V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, LU1/h$k;->b:F

    .line 2
    .line 3
    iget-object v1, p0, LU1/h$k;->c:LU1/h;

    .line 4
    .line 5
    invoke-static {v1}, LU1/h;->c(LU1/h;)LU1/h$h;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, LU1/h$h;->d:Landroid/graphics/Paint;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    add-float/2addr v0, p1

    .line 16
    iput v0, p0, LU1/h$k;->b:F

    .line 17
    .line 18
    return-void
.end method
