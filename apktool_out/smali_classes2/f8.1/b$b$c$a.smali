.class final Lf8/b$b$c$a;
.super Lm8/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/b$b$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm8/b;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lm8/e;Lm8/g;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lf8/b$b$c$a;->j(Lm8/e;Lm8/g;)Lf8/b$b$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public j(Lm8/e;Lm8/g;)Lf8/b$b$c;
    .locals 2

    .line 1
    new-instance v0, Lf8/b$b$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, p2, v1}, Lf8/b$b$c;-><init>(Lm8/e;Lm8/g;Lf8/a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
