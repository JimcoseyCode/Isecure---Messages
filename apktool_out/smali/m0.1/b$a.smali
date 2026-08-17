.class final Lm0/b$a;
.super Lm0/e;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic j:Lm0/b;


# direct methods
.method public constructor <init>(Lm0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/b$a;->j:Lm0/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lm0/b;->r()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-direct {p0, p1}, Lm0/e;-><init>(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method protected c(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b$a;->j:Lm0/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm0/b;->w(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method protected d(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b$a;->j:Lm0/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm0/b;->s(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
