.class public final LA8/w$c$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA8/w$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic g:Lm8/r;

.field final synthetic h:Ljava/io/ByteArrayInputStream;

.field final synthetic i:LA8/w;


# direct methods
.method public constructor <init>(Lm8/r;Ljava/io/ByteArrayInputStream;LA8/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA8/w$c$a;->g:Lm8/r;

    .line 2
    .line 3
    iput-object p2, p0, LA8/w$c$a;->h:Ljava/io/ByteArrayInputStream;

    .line 4
    .line 5
    iput-object p3, p0, LA8/w$c$a;->i:LA8/w;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Lm8/p;
    .locals 3

    .line 1
    iget-object v0, p0, LA8/w$c$a;->g:Lm8/r;

    .line 2
    .line 3
    iget-object v1, p0, LA8/w$c$a;->h:Ljava/io/ByteArrayInputStream;

    .line 4
    .line 5
    iget-object v2, p0, LA8/w$c$a;->i:LA8/w;

    .line 6
    .line 7
    invoke-virtual {v2}, LA8/w;->s()Ly8/p;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ly8/p;->c()Ly8/n;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ly8/n;->k()Lm8/g;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v0, v1, v2}, Lm8/r;->b(Ljava/io/InputStream;Lm8/g;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lm8/p;

    .line 24
    .line 25
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LA8/w$c$a;->a()Lm8/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
