.class public Ly/F;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly/F$b;
    }
.end annotation


# static fields
.field public static final d:Ly/F;


# instance fields
.field private final a:F

.field private final b:LH0/d;

.field private final c:LH0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ly/F$b;

    .line 2
    .line 3
    invoke-direct {v0}, Ly/F$b;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ly/F$b;->b(F)Ly/F$b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2, v2}, Ly/F$b;->c(FF)Ly/F$b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1, v1}, Ly/F$b;->d(FF)Ly/F$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ly/F$b;->a()Ly/F;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Ly/F;->d:Ly/F;

    .line 26
    .line 27
    return-void
.end method

.method private constructor <init>(FLH0/d;LH0/d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Ly/F;->a:F

    .line 4
    iput-object p2, p0, Ly/F;->b:LH0/d;

    .line 5
    iput-object p3, p0, Ly/F;->c:LH0/d;

    return-void
.end method

.method synthetic constructor <init>(FLH0/d;LH0/d;Ly/F$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ly/F;-><init>(FLH0/d;LH0/d;)V

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 1
    iget v0, p0, Ly/F;->a:F

    .line 2
    .line 3
    return v0
.end method

.method public b()LH0/d;
    .locals 1

    .line 1
    iget-object v0, p0, Ly/F;->b:LH0/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()LH0/d;
    .locals 1

    .line 1
    iget-object v0, p0, Ly/F;->c:LH0/d;

    .line 2
    .line 3
    return-object v0
.end method
