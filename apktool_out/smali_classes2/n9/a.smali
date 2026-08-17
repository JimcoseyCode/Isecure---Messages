.class public interface abstract Ln9/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln9/a$a;
    }
.end annotation


# static fields
.field public static final a:Ln9/a;

.field public static final b:Ln9/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln9/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ln9/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ln9/a;->b:Ln9/a$a;

    .line 8
    .line 9
    new-instance v0, Ln9/a$a$a;

    .line 10
    .line 11
    invoke-direct {v0}, Ln9/a$a$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ln9/a;->a:Ln9/a;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/io/File;)Lt9/F;
.end method

.method public abstract b(Ljava/io/File;)Lt9/D;
.end method

.method public abstract c(Ljava/io/File;)V
.end method

.method public abstract d(Ljava/io/File;)Z
.end method

.method public abstract e(Ljava/io/File;Ljava/io/File;)V
.end method

.method public abstract f(Ljava/io/File;)V
.end method

.method public abstract g(Ljava/io/File;)Lt9/D;
.end method

.method public abstract h(Ljava/io/File;)J
.end method
