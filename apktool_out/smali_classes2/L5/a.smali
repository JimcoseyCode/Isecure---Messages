.class public final synthetic LL5/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lq5/g;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lq5/c;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lq5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL5/a;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, LL5/a;->b:Lq5/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lq5/d;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LL5/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, LL5/a;->b:Lq5/c;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, LL5/b;->b(Ljava/lang/String;Lq5/c;Lq5/d;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
