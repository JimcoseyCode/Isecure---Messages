.class public final Lj9/f$d;
.super Ls9/d$d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj9/f;->x(Lj9/c;)Ls9/d$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic j:Lj9/c;

.field final synthetic k:Lt9/j;

.field final synthetic l:Lt9/i;


# direct methods
.method constructor <init>(Lj9/c;Lt9/j;Lt9/i;ZLt9/j;Lt9/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj9/f$d;->j:Lj9/c;

    .line 2
    .line 3
    iput-object p2, p0, Lj9/f$d;->k:Lt9/j;

    .line 4
    .line 5
    iput-object p3, p0, Lj9/f$d;->l:Lt9/i;

    .line 6
    .line 7
    invoke-direct {p0, p4, p5, p6}, Ls9/d$d;-><init>(ZLt9/j;Lt9/i;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public close()V
    .locals 6

    .line 1
    iget-object v0, p0, Lj9/f$d;->j:Lj9/c;

    .line 2
    .line 3
    const/4 v4, 0x1

    .line 4
    const/4 v5, 0x0

    .line 5
    const-wide/16 v1, -0x1

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-virtual/range {v0 .. v5}, Lj9/c;->a(JZZLjava/io/IOException;)Ljava/io/IOException;

    .line 9
    .line 10
    .line 11
    return-void
.end method
