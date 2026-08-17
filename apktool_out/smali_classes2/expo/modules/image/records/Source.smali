.class public interface abstract Lexpo/modules/image/records/Source;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/image/records/Source$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0010\u001a\u00020\r8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00138&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0015\u0082\u0001\u0002\u0019\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lexpo/modules/image/records/Source;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lexpo/modules/image/GlideModelProvider;",
        "createGlideModelProvider",
        "(Landroid/content/Context;)Lexpo/modules/image/GlideModelProvider;",
        "LM1/f;",
        "createGlideOptions",
        "(Landroid/content/Context;)LM1/f;",
        "",
        "usesPlaceholderContentFit",
        "()Z",
        "",
        "getWidth",
        "()I",
        "width",
        "getHeight",
        "height",
        "",
        "getScale",
        "()D",
        "scale",
        "getPixelCount",
        "pixelCount",
        "Lexpo/modules/image/records/DecodedSource;",
        "Lexpo/modules/image/records/SourceMap;",
        "expo-image_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract createGlideModelProvider(Landroid/content/Context;)Lexpo/modules/image/GlideModelProvider;
.end method

.method public abstract createGlideOptions(Landroid/content/Context;)LM1/f;
.end method

.method public abstract getHeight()I
.end method

.method public abstract getPixelCount()D
.end method

.method public abstract getScale()D
.end method

.method public abstract getWidth()I
.end method

.method public abstract usesPlaceholderContentFit()Z
.end method
