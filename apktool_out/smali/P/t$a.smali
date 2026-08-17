.class public abstract LP/t$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static a:Ln/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LP/s;

    .line 2
    .line 3
    invoke-direct {v0}, LP/s;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LP/t$a;->a:Ln/a;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ly/H;)LP/P;
    .locals 1

    .line 1
    sget-object v0, LP/t$a;->a:Ln/a;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ln/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LP/P;

    .line 8
    .line 9
    return-object p0
.end method
